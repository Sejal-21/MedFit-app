package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Button gs1 = findViewById(R.id.GS1);
        Button gs2 = findViewById(R.id.GS2);
        Button gs3 = findViewById(R.id.GS3);

        gs1.setOnClickListener(this);
        gs2.setOnClickListener(this);
        gs3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.GS1:
                Toast.makeText(this, "GET STARTED 1", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(page2.this, GetStarted1.class);
                startActivity(i);
                break;

            case R.id.GS2:
                Toast.makeText(this, "GET STARTED 2", Toast.LENGTH_SHORT).show();
                Intent j = new Intent(page2.this, GetStarted2.class);
                startActivity(j);
                break;


            case R.id.GS3:
                Toast.makeText(this, "GET STARTED 3", Toast.LENGTH_SHORT).show();
                Intent k = new Intent(page2.this, GetStarted3.class);
                startActivity(k);
                break;


        }

    }
}