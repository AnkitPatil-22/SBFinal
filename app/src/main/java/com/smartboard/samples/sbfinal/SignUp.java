package com.smartboard.samples.sbfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.smartboard.samples.sbfinal.R;

public class SignUp extends AppCompatActivity {

    ImageView backButton;
    TextView SignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(view -> {
//            Intent intent = new Intent(SignUp.this, HomeScreen.class);
//            startActivity(intent);
            finish();
        });

        SignInButton = findViewById(R.id.login);
        SignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(SignUp.this, SignIn.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}