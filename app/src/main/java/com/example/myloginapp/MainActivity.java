package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Username = findViewById(R.id.Username);
        TextView Password = findViewById(R.id.password);

        Button Loginbtn = (Button) findViewById(R.id.Loginbtn);

        //admin and admin

        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin")) {
                    //correct
                    Toast.makeText(MainActivity.this, "lOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                } else
                    //incorrect
                    Toast.makeText(MainActivity.this, "lOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}