package com.example.gokhansahin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Elif="com.example.gokhansahin.myapplication.mymessage";
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Log.d("Test", "Button clicked!");
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                 ed= (EditText) findViewById(R.id.editText);
                String message=ed.getText().toString();
                intent.putExtra(Elif,message);
                startActivity(intent);




            }
        });
    }
}
