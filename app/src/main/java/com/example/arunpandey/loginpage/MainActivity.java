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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mail = findViewById(R.id.editText3);

        EditText pass = findViewById(R.id.editText4);

        Button register = findViewById(R.id.button);

        id = String.valueOf(mail.getText()); // gmail id store here

        password = String.valueOf(pass.getText()); //password store here

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, LoginHere.class);

                intent.putExtra("Mail", id);
                intent.putExtra("Pass", password);
                startActivity(intent);


            }
        });

    }




}
