package example.callapp;

import android.content.Intent; // 인터넷이나 전화를 사용하기 위해 필요한 패키지
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // 버튼을 사용하기 위해 필요한 패키지
import android.widget.EditText; // 에딧텍스트를 사용하기 위해 필요한 패키지


public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 입력한 텍스트 객체의 데이터 값을 가져온다.
                String receiver =editText.getText().toString();
                // 인텐트 객체 생성, 전화옵션, 전화번호 데이터 넣기
                Intent Internet = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+receiver));
                startActivity(Internet);
            }
        });
    }
}