package com.example.arunpandey.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String id,password;
    EditText mail;
    EditText pass;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mail = findViewById(R.id.editText3);

         pass = findViewById(R.id.editText4);

         register = findViewById(R.id.button);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                id = mail.getText().toString(); // gmail id store here

                password = pass.getText().toString(); //password store here

                Intent intent = new Intent(MainActivity.this, LoginHere.class);

                intent.putExtra("Mail", id);
                intent.putExtra("Pass", password);
                startActivity(intent);


            }
        });

    }




}
