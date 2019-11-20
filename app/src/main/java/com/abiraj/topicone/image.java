package com.abiraj.topicone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class image extends AppCompatActivity implements View.OnClickListener
{

    private RadioButton rdoOpera, rdoCollesum, rdoTaj;
    private ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        rdoOpera = findViewById(R.id.rdoOp);
        rdoCollesum = findViewById(R.id.rdoCo);
        rdoTaj = findViewById(R.id.rdoTj);
        imgv = findViewById(R.id.imgTaj);

        rdoTaj.setOnClickListener(this);
        rdoCollesum.setOnClickListener(this);
        rdoOpera.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {  // jaha click gareko cha tesko id view v ma aako huncha.
        switch (v.getId()) {

            case R.id.rdoCo:
                imgv.setImageResource(R.drawable.collesum);
                break;

            case R.id.rdoOp:
                imgv.setImageResource(R.drawable.opera);
                break;

            case R.id.rdoTj:
                imgv.setImageResource(R.drawable.taj);
                break;

        }

    }
}
