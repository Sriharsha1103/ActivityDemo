package com.vvit.ammu.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nextActivity(View view){
        EditText et=(EditText)findViewById(R.id.id_edit_text);
        String msg=et.getText().toString();

        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("message",msg);

        startActivity(intent);
    }
}
