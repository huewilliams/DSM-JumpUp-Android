package example.seekbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewEx viewEX = new ViewEx(this);
        setContentView(viewEX);
    }
    protected class ViewEx extends View
    {
        public ViewEx(Context context)
        {
            super(context);
        }
        public void onDraw(Canvas canvas)
        {
            canvas.drawColor(Color.BLACK);

            Paint MyPaint = new Paint();
            Path path = new Path();
            MyPaint.setColor(Color.GREEN);
            path.moveTo(250,0);
            path.lineTo(200,100);
            path.lineTo(300,100);
            canvas.drawPath(path, MyPaint);

            MyPaint.setColor(Color.YELLOW);
            canvas.drawCircle(150,450,50,MyPaint);
            canvas.drawCircle(350,450,50,MyPaint);

            MyPaint.setColor(Color.BLUE);
            MyPaint.setStrokeWidth(30f);
            canvas.drawLine(0,200,100,200, MyPaint);
            canvas.drawLine(0,300,100,300, MyPaint);

            MyPaint.setColor(Color.RED);
            canvas.drawRect(100, 100, 400, 400, MyPaint);

            MyPaint.setColor(Color.WHITE);
            canvas.drawCircle(425,375,25, MyPaint);
            canvas.drawCircle(425,325,25, MyPaint);
        }
    }

}
