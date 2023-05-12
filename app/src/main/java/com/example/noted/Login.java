package com.example.noted;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

        EditText loginText, passwordText;
        Button btnLogin;
        TextView textView3;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            getSupportActionBar().hide();
            setContentView(R.layout.activity_login);

            loginText = (EditText) findViewById(R.id.emailAddress);
            passwordText = (EditText) findViewById(R.id.password);
            btnLogin = (Button) findViewById(R.id.loginButton);
            textView3 = (TextView) findViewById(R.id.textView3);

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String username = loginText.getText().toString();
                    String password = passwordText.getText().toString();

                    if (username.equals("beary") && password.equals("gud")) {
                        Toast.makeText(Login.this, "Welcome to Noted", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Login.this, "Invalid Credentials.", Toast.LENGTH_SHORT).show();
                    }


                }
            });

            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Login.this, "Sign Up to Noted", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Signup.class);
                    startActivity(intent);
                }
            });

        }
}