package com.example.gokhansahin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.gokhansahin.myapplication.REPLY";
    EditText edittxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message =
                intent.getStringExtra(MainActivity.Elif);
       TextView edt= (TextView) findViewById(R.id.text_message);
        edt.setText(message);
        Log.d("Test2",message);

    }//oncreate
    public void returnReply(View elif)
        {
            Log.d("Test3","Hello");
            Intent replyIntent = new Intent();
            edittxt= (EditText) findViewById(R.id.editText_second);
            String ynt=edittxt.getText().toString() ;

            replyIntent.putExtra(EXTRA_REPLY, ynt);
            setResult(RESULT_OK, replyIntent);
            finish();

        }
}//main
