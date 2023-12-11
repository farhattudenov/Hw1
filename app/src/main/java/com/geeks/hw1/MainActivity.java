package com.geeks.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra()
        startActivity(intent);
        Public class MainActivity extends AppCompatActivity {

            private EditText editTextEmail;
            private EditText editTextSubject;
            private EditText editTextMessage;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                editTextEmail = findViewById(R.id.editTextEmail);
                editTextSubject = findViewById(R.id.editTextSubject);
                editTextMessage = findViewById(R.id.editTextMessage);

    }
}