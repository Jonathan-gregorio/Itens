package com.example.jon1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vincula el boton del archivo activity_main.cml con el mainActiviti.java
        Button btnmaa = findViewById(R.id.btnma);

        btnmaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ira2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(Ira2);
            }
        });


    }
}