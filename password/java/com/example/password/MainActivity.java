package com.example.password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    EditText input2;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        input2 = (EditText) findViewById(R.id.input2);
        check = (Button) findViewById(R.id.check);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().equals(input2.getText().toString()))
                {
                    if(input.getText().toString().contains("!"))
                        Toast.makeText(getApplicationContext(), "계정이 생성되었습니다", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(), "특수기호를 사용해주세요", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "비밀번호가 일치하지 않습니다.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
