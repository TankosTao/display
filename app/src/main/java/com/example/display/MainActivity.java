package com.example.display;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView1=findViewById(R.id.text_ada);
        textView2=findViewById(R.id.text_james);
   //     TextView contentTV = (TextView) findViewById(R.id.textView4);
     //   contentTV.setMovementMethod(ScrollingMovementMethod.getInstance());

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.test_land);
        //    String appName=(String) this.getResources().getText(R.string.james);
        //    textView2.setText(appName);

        }
        else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.landlayout);

     //       String appName=(String) this.getResources().getText(R.string.ada);
     //       textView1.setText(appName);


        }


    }


}
