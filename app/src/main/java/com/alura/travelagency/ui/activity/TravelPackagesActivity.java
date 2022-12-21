package com.alura.travelagency.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.alura.travelagency.R;
import com.alura.travelagency.ui.adapter.PackagesListAdapter;

public class TravelPackagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_packages);
        ListView packagesList = findViewById(R.id.lv_travel_pkg);
        packagesList.setAdapter(new PackagesListAdapter());
    }
}