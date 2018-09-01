package example.carculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    String num[] = {"","","","","","","","","","","","","","","","","","","","","","",""};

    // 버튼 아이디 배열
    int[] btn = {
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7,
            R.id.btn8, R.id.btn9
    };
    // 0~9 숫자
    String number[] = {"0","1","2","3","4","5","6","7","8","9"};
    // 숫자 입력 버튼
    Button btnNum[] = new Button[10];
    // C (초기화)버튼, plus(더하기) 버튼, enter(연산실행) 버튼
    Button c, plus, enter;
    //num배열 변수 - index, 연산판단 변수 - operation 0:연산없음, 1:plus, 연산결과 - result
    int index=0, operation = 0, result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 숫자 입력 버튼 매칭
        edit1 = (EditText) findViewById(R.id.edit1);
        for(int i=0;i<btn.length;i++) {
            btnNum[i] = (Button) findViewById(btn[i]);
        }
        // C(초기화) 버튼 매칭
        c = (Button) findViewById(R.id.C);
        // plus(더하기) 버튼 매칭
        plus = (Button) findViewById(R.id.plus);
        // enter(연산결과) 버튼 매칭
        enter = (Button) findViewById(R.id.enter);

        // 0~9 까지의 숫자 입력
        for(int i=0;i<btn.length;i++) {
            final int tmp;
            tmp = i;
            btnNum[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num[index] += number[tmp];
                    edit1.setText(num[index]);
                    oper(operation);
                 }
            });
        }

        // 숫자 저장 공간 초기화
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<index+1;i++)
                {
                    num[i] = "";
                }
                index = 0;
                edit1.setText(num[index]);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 문자열을 저장할 공간 하나 이동
                index++;
                // 연산 판단 변수를 1(plus)로 지정
                operation = 1;
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(result + "");
                result = 0;
            }
        });
    }
    void oper(int operation) {
        if(operation == 0) {}
        // 더하기
        else if(operation == 1) {
            if(result>0)
                result = result + Integer.parseInt(num[index]);
            else
                result = Integer.parseInt(num[index-1]) + Integer.parseInt(num[index]);
        }
    }
}