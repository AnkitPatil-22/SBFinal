package com.google.mlkit.samples.vision.digitalink;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

@SuppressWarnings("ALL")
public class HomeScreen extends AppCompatActivity {

    Button SignInButton;
    Button StartButton;
    Button HelpButton;
    private int STORAGE_PERMISSION_CODE = 1;

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


        //TO ASK PERMISSION FOR STORAGE

//        StartButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (ContextCompat.checkSelfPermission(HomeScreen.this,
//                        Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
//                    Toast.makeText(HomeScreen
//                                    .this, "Welcome to SmartBoard !",
//                            Toast.LENGTH_SHORT).show();
//
//                    Intent intent = new Intent(HomeScreen.this, DigitalInkMainActivity.class);
//                    startActivity(intent);
//
//                } else {
//                    requestStoragePermission();
//                }
//            }
//        });
//    }
//    private void requestStoragePermission() {
//        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                Manifest.permission.READ_EXTERNAL_STORAGE)) {
//            new androidx.appcompat.app.AlertDialog.Builder(this)
//                    .setTitle("Storage permission required")
//                    .setMessage("This permission is required for proper functioning of app and its feature.")
//                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            ActivityCompat.requestPermissions(HomeScreen.this,
//                                    new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
//                        }
//                    })
//                    .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            dialog.dismiss();
//                        }
//                    })
//                    .create().show();
//        } else {
//            ActivityCompat.requestPermissions(this,
//                    new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
//        }

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