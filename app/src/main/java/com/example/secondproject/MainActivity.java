package com.example.secondproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnGreeting;
    EditText edtName;
    TextView txtvHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGreeting= findViewById(R.id.btngreeting);
        edtName=findViewById(R.id.edtname);
        txtvHello=findViewById(R.id.txtvhello);
//        Toast.makeText(this,"OnCreate",Toast.LENGTH_LONG).show();
    }

    public void greeting(View view) {
        String name=edtName.getText().toString();
        if(name.length()<50){
//            txtvHello.setText("hello "+name);
            Toast.makeText(this,"hello "+name,Toast.LENGTH_LONG).show();
        }else{
            txtvHello.setText("please enter a valid name");
        }
//        Toast.makeText(this,"Hello "+name+", Greeting to see you",Toast.LENGTH_LONG);
        Log.d("clickCheck","clicked");
    }
}