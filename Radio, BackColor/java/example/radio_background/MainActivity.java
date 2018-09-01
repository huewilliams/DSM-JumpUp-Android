package example.radio_background;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton red;
    RadioButton green;
    RadioButton blue;
    LinearLayout mlayout;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        mlayout = (LinearLayout) findViewById(R.id.mlayout);
        red = (RadioButton) findViewById(R.id.red);
        green = (RadioButton) findViewById(R.id.green);
        blue = (RadioButton) findViewById(R.id.blue);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlayout.setBackgroundColor(Color.rgb(255,0,0));
                text.setTextColor(Color.rgb(0,255,0));
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlayout.setBackgroundColor(Color.rgb(0,255,0));
                text.setTextColor(Color.rgb(0,0,255));
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlayout.setBackgroundColor(Color.rgb(0,0,255));
                text.setTextColor(Color.rgb(255,0,0));
            }
        });
    }
}
