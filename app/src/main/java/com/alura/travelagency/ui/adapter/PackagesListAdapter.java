package com.alura.travelagency.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.alura.travelagency.R;
import com.alura.travelagency.model.PackageDeal;

import java.util.List;

public class PackagesListAdapter extends BaseAdapter {

    private final List<PackageDeal> packageDeals;
    private final Context context;

    public PackagesListAdapter(List<PackageDeal> packageDeals, Context context) {

        this.packageDeals = packageDeals;
        this.context = context;
    }

    @Override
    public int getCount() {
        return packageDeals.size();
    }

    @Override
    public PackageDeal getItem(int position) {
        return packageDeals.get(position)
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View createdView = LayoutInflater.from(context)
                .inflate(R.layout.item_package, parent, false);
        return createdView;
    }
}
