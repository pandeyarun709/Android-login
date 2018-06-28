package com.example.arunpandey.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class LoginHere extends AppCompatActivity {

    String id,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_here);

        final String mailId = getIntent().getStringExtra("Mail"); //getting mail id from registration page

       final String passwrd = getIntent().getStringExtra("Pass"); //getting password from registration page

 /* ########################################################################################## */
        EditText mail = findViewById(R.id.editText5);

        EditText pass = findViewById(R.id.editText2);

        Button login = findViewById(R.id.button2);

        id = String.valueOf(mail.getText()); // gmail id at login page

        password = String.valueOf(pass.getText()); // pass enter at login page

       // login.setOnClickListener(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(id.compareTo(mailId) == 0 && password.compareTo(passwrd) == 0)
               {
                   Toast t1 = makeText(getApplicationContext(),"Login Successfully !!",Toast.LENGTH_LONG);
                   t1.show();
                   t1.setGravity(Gravity.CENTER , 0 , 0 );
               }
               else {

                  Toast t2 =  makeText( getApplicationContext(), "Wrong password or mail !!" , Toast.LENGTH_LONG);
                  t2.show();
                  t2.setGravity(Gravity.CENTER , 0 , 0 );
               }


            }


        });



    }
}
