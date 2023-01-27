package com.alura.travelagency.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.alura.travelagency.util.CurrencyUtil;
import com.alura.travelagency.util.DaysUtil;
import com.alura.travelagency.R;
import com.alura.travelagency.util.ResUtil;
import com.alura.travelagency.model.TripPackage;

import java.util.List;

public class PackagesListAdapter extends BaseAdapter {

    private final List<TripPackage> tripPackages;
    private final Context context;

    public PackagesListAdapter(List<TripPackage> tripPackages, Context context) {

        this.tripPackages = tripPackages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return tripPackages.size();
    }

    @Override
    public TripPackage getItem(int position) {
        return tripPackages.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View createdView = LayoutInflater.from(context)
                .inflate(R.layout.item_package, parent, false);

        TripPackage tripPackage = this.tripPackages.get(position);

        showPlace(createdView, tripPackage);
        showImage(createdView, tripPackage);
        showDays(createdView, tripPackage);
        showPrices(createdView, tripPackage);

        return createdView;
    }

    private void showPrices(View createdView, TripPackage tripPackage) {
        TextView price = createdView.findViewById(R.id.tv_item_price);
        String usd = CurrencyUtil.formattingModelCurrency(tripPackage.getPrice());
        price.setText(usd);
    }

    private void showDays(View createdView, TripPackage tripPackage) {
        TextView period = createdView.findViewById(R.id.tv_item_period);
        String periodAsTxt = DaysUtil.formattingToTxt(tripPackage.getDays());
        period.setText(periodAsTxt);
    }

    private void showImage(View createdView, TripPackage tripPackage) {
        ImageView image = createdView.findViewById(R.id.iv_item_place_pkg);
        Drawable drawableImagePkg = ResUtil
                .returnDrawable(context, tripPackage.getBanner());
        image.setImageDrawable(drawableImagePkg);
    }

    private void showPlace(View createdView, TripPackage tripPackage) {
        TextView place = createdView.findViewById(R.id.tv_item_place);
        place.setText(tripPackage.getDestination());
    }
}
