package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mystring=editText1.getText().toString();
                int mynumber=Integer.parseInt(mystring);
                String mystring1=editText2.getText().toString();
                int mynumber1=Integer.parseInt(mystring1);
                if (mynumber>0){
                    Toast.makeText(MainActivity.this,mynumber+ "বড় সংখ্যা" ,Toast.LENGTH_LONG).show();
                }
                else if(mynumber1<0){
                    Toast.makeText(MainActivity.this,mynumber1+"ছোট সংখ্যা",Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}