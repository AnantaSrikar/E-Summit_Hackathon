package com.hackathon.e_summit.srikar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class RegistrationActivity extends AppCompatActivity {

    private TextInputEditText Name, Email, Password,PasswordConf;
    private ImageView ProfilePic;
    private Button Register;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        setupUIV();



    }

    private void setupUIV(){

        Name         = findViewById(R.id.RAname);
        Email        = findViewById(R.id.RAemail);
        Password     = findViewById(R.id.RApassword);
        PasswordConf = findViewById(R.id.RApassword2);
        Register     = findViewById(R.id.RAregister);
        ProfilePic   = findViewById(R.id.RAprofilePic);
    }
}
