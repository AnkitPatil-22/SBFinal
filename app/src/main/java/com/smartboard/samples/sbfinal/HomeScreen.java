package com.smartboard.samples.sbfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.smartboard.samples.sbfinal.R;

@SuppressWarnings("ALL")
public class HomeScreen extends AppCompatActivity {

    Button SignInButton;
    Button StartButton;
    Button HelpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        SignInButton = findViewById(R.id.signin_btn);
        SignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, SignIn.class);
                startActivity(intent);
            }
        });

        StartButton = findViewById(R.id.start_btn);
        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, DigitalInkMainActivity.class);
                startActivity(intent);
            }


            
        });

//        HelpButton = findViewById(R.id.help_btn);
//        HelpButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(HomeScreen.this, MainScreen.class);
//                startActivity(intent);
//            }
//        });

    }
}