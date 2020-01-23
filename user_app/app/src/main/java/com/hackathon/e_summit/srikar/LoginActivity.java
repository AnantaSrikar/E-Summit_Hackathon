package com.hackathon.e_summit.srikar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText Email, Password;
    private Button Login;
    private ProgressDialog progressDialog;
    private TextView ForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupUIV();


    }

    private void setupUIV(){

        Email          = findViewById(R.id.LAemail);
        Password       = findViewById(R.id.LApassword);
        Login          = findViewById(R.id.LAlogin);
        ForgotPassword = findViewById(R.id.LAforgotPassword);

    }
}
