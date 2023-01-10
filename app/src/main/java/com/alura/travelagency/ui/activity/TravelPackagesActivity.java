package com.alura.travelagency.ui.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.alura.travelagency.R;
import com.alura.travelagency.dao.PackageDAO;
import com.alura.travelagency.model.PackageDeal;
import com.alura.travelagency.ui.adapter.PackagesListAdapter;

import java.util.List;

public class TravelPackagesActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Packages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_packages);

        setTitle(TITLE_APPBAR);
        listConfig();
    }

    private void listConfig() {
        ListView packagesList = findViewById(R.id.lv_travel_pkg);
        List<PackageDeal> packagesDeals = new PackageDAO().list();
        packagesList.setAdapter(new PackagesListAdapter(packagesDeals, this));
    }
}