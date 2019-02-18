package com.example.demodatabase;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText e_name,e_password,e_contact,e_country;
    String name, password, contact, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e_name = findViewById(R.id.et_name);
        e_password = findViewById(R.id.et_password);
        e_contact = findViewById(R.id.et_contact);
        e_country = findViewById(R.id.et_country);

    }

    public void register_user(View view){
        name = e_name.getText().toString();
        password = e_password.getText().toString();
        contact = e_contact.getText().toString();
        country = e_country.getText().toString();
    }

}
