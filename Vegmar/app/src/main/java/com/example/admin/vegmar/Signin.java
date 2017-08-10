package com.example.admin.vegmar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Signin extends AppCompatActivity {
    Button sell,status,rate,edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        sell=(Button)findViewById(R.id.button3);
        status=(Button)findViewById(R.id.button4);
        rate=(Button)findViewById(R.id.button5);
        edit=(Button)findViewById(R.id.button6);
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Signin.this,Veglist.class);
                startActivity(i);
            }
        });
    }
}
