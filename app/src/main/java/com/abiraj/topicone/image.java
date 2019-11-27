package com.abiraj.topicone;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;


public class image extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rdoOpera, rdoCollesum, rdoTaj;
    private ImageView imgv;
    AlertDialog.Builder builder;

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

        builder = new AlertDialog.Builder(this);

    }

    @Override
    public void onClick(View v) {  // jaha click gareko cha tesko id view v ma aako huncha.
        switch (v.getId()) {

            case R.id.rdoCo:
                builder.setMessage(" want to load this image ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                imgv.setImageResource(R.drawable.collesum);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(image.this, "you clicked no", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alert = builder.create();
                alert.setTitle("Do you");
                alert.show();

                break;

            case R.id.rdoOp:
                builder.setMessage(" want to load this image ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                imgv.setImageResource(R.drawable.opera);
                            }
                        })
                        .setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(image.this, "You clicked No", Toast.LENGTH_SHORT).show();
                            }
                        });


                AlertDialog alert1 = builder.create();
                alert1.setTitle("Do you");
                alert1.show();

                break;

            case R.id.rdoTj:
                builder.setMessage(" want to load this image ?")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                imgv.setImageResource(R.drawable.taj);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(image.this, "You clicked no", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alert2 = builder.create();
                alert2.setTitle("Do you");
                alert2.show();

                break;
        }


    }
}
