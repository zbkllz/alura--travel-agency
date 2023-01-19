package com.alura.travelagency.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.alura.travelagency.R;

public class ResumePackageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_package);

        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }
}