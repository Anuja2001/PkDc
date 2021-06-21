package com.example.pokedoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RoleActivity extends AppCompatActivity {

    Button Patient,Doctor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);
        Patient = findViewById(R.id.patient_button);
        Doctor = findViewById(R.id.doctor_button);
        Patient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RoleActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Doctor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RoleActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}