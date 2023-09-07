package com.example.parentpool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SignIn(View v) {
        String message;


        EditText input = findViewById(R.id.email_address);
        String email = input.getText().toString();
        input = findViewById(R.id.password);
        String password = input.getText().toString();

        if (!email.contains("@")) {
            message = "The Email Address Is Not Valid";
            ((TextView) findViewById(R.id.output)).setText(message);
            return;
        }

//        if (!email.contains("@")) {
//            message = "The Email Address Is Not Valid";
//            ((TextView) findViewById(R.id.output)).setText(message);
//            return;
//        }

        if (email.equals("admin@gamil.com") && password.equals("admin")) {
            message = "You've Sign In!!!🥳";
            ((TextView) findViewById(R.id.output)).setText(message);
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

            Intent i = new Intent(this, GoogleMap.class);
            startActivity(i);
        }
    }

    public void SignUp(View v) {

    }
}