package com.example.display;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private Resources resources;

    private Configuration config;

    private DisplayMetrics dm;

    //在app的入口（application）的oncreate方法中调用此方法

    public boolean getlanguage()
    {
        //获取系统当前的语言
        String able= getResources().getConfiguration().locale.getLanguage();
        resources =getResources();//获得res资源对象
        config = resources.getConfiguration();//获得设置对象
        dm = resources.getDisplayMetrics();
        //根据系统语言进行设置
        if (able.equals("zh")) {
           return false;

        }
        else if(able.equals("en"))
        {
            return true;
        }
        else return false;
    }

  //  通过设置手机系
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
boolean check=getlanguage();


   //     TextView contentTV = (TextView) findViewById(R.id.textView4);
     //   contentTV.setMovementMethod(ScrollingMovementMethod.getInstance());

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.test_land);
            textView2=findViewById(R.id.text_james);
            String appName=(String) this.getResources().getText(R.string.james);
            textView2.setText(appName);
        /*
            if(check) {String appName=(String) this.getResources().getText(R.string.james);
           textView2.setText(appName);}
           else {
               String appName=(String) this.getResources().getText(R.string.c_james);
                textView2.setText(appName);
           }
*/
        }
        else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.landlayout);
            textView1=findViewById(R.id.text_ada);
            String appName=(String) this.getResources().getText(R.string.ada);
            textView1.setText(appName);
         /*   if(check) {String appName=(String) this.getResources().getText(R.string.ada);
                textView1.setText(appName);}
            else {String appName=(String) this.getResources().getText(R.string.c_ada);
                textView1.setText(appName);}

*/
        }


    }


}
