package com.example.imageevent;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView gold1, gold2, gold3, gold4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gold1 = (ImageView) findViewById(R.id.goldcard1);
        gold2 = (ImageView) findViewById(R.id.goldcard2);
        gold3 = (ImageView) findViewById(R.id.goldcard3);
        gold4 = (ImageView) findViewById(R.id.goldcard4);

        gold1.setOnClickListener(new View.OnClickListener() {
            boolean mi=false, ur=false;

            public void onClick(View v) {
                gold1.setImageResource(R.drawable.midoriya);
                if(mi == false) {
                    if(ur==false)
                        mi=true;
                    else
                    {
                        ur = false;
                        gold1.setImageResource(R.drawable.goldcard);
                    }
                }
                else
                    Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_LONG).show();
            }
        });

        gold2.setOnClickListener(new View.OnClickListener() {
            boolean mi=false, ur=false;

            public void onClick(View v) {
                gold2.setImageResource(R.drawable.uraraka);
                if(ur == false) {
                    if(mi==false)
                        ur=true;
                    else
                    {
                        mi = false;
                        gold2.setImageResource(R.drawable.goldcard);
                    }
                }
                else
                    Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_LONG).show();
            }
        });

        gold3.setOnClickListener(new View.OnClickListener() {
            boolean mi=false, ur=false;

            public void onClick(View v) {
                gold3.setImageResource(R.drawable.midoriya);
                if(mi == false) {
                    if(ur==false)
                        mi=true;
                    else
                    {
                        ur = false;
                        gold3.setImageResource(R.drawable.goldcard);
                    }
                }
                else
                    Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_LONG).show();
            }
        });

        gold4.setOnClickListener(new View.OnClickListener() {
            boolean mi=false, ur=false;

            public void onClick(View v) {
                gold4.setImageResource(R.drawable.uraraka);
                if(ur == false) {
                    if(mi==false)
                        ur=true;
                    else
                    {
                        mi = false;
                        gold4.setImageResource(R.drawable.goldcard);
                    }
                }
                else
                    Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_LONG).show();
            }
        });
    }
}