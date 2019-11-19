package com.abiraj.topicone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etFirst, etSecond;
    private RadioButton RdoAdd, RdoSub, Rdomul;
    private Button BtnCalculate;
    private int Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding
        etFirst = findViewById(R.id.etFst);
        etSecond = findViewById(R.id.etSec);
        RdoAdd = findViewById(R.id.radAdd);
        RdoSub = findViewById(R.id.radSub);
        Rdomul = findViewById(R.id.radMul);
        BtnCalculate = findViewById(R.id.btCalc);

        if(TextUtils.isEmpty(etFirst.getText())){
            etFirst.setError("Please Enter First Number");
            etFirst.requestFocus();
        }

        if(TextUtils.isEmpty(etSecond.getText())){
            etSecond.setError("Please Enter Second Number");
            etSecond.requestFocus();
        }

        BtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override



            public void onClick(View v) {



                int First , Second;

                First = Integer.parseInt(etFirst.getText().toString());
                Second = Integer.parseInt(etSecond.getText().toString());

                if (RdoAdd.isChecked()) {
                    Result = First + Second;
                }

                else if (RdoSub.isChecked()){
                    Result = First - Second;
                }else{
                    Result = First * Second;
                }
                Toast.makeText(MainActivity.this, "The Result is" + Result, Toast.LENGTH_LONG).show();


            }
        });
    }


}
