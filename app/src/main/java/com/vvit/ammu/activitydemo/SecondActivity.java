package com.vvit.ammu.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String info=intent.getStringExtra("message");

        TextView tv=(TextView)findViewById(R.id.msg_textView);
        tv.setText(info);
    }
    public void previousActivity(View view){

        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
