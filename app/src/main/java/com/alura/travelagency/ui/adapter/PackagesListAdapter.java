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
        return packageDeals.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View createdView = LayoutInflater.from(context)
                .inflate(R.layout.item_package, parent, false);

        PackageDeal packageDeal = packageDeals.get(position);

        showPlace(createdView, packageDeal);
        showImage(createdView, packageDeal);
        showDays(createdView, packageDeal);
        showPrices(createdView, packageDeal);

        return createdView;
    }

    private void showPrices(View createdView, PackageDeal packageDeal) {
        TextView price = createdView.findViewById(R.id.tv_item_price);
        String usd = CurrencyUtil.formatModelCurrency(packageDeal.getPrice());
        price.setText(usd);
    }

    private void showDays(View createdView, PackageDeal packageDeal) {
        TextView period = createdView.findViewById(R.id.tv_item_period);
        String periodAsTxt = DaysUtil.formatToTxt(packageDeal.getPeriod());
        period.setText(periodAsTxt);
    }

    private void showImage(View createdView, PackageDeal packageDeal) {
        ImageView image = createdView.findViewById(R.id.iv_item_place_pkg);
        Drawable drawableImagePkg = ResUtil
                .returnDrawable(context, packageDeal.getImage());
        image.setImageDrawable(drawableImagePkg);
    }

    private void showPlace(View createdView, PackageDeal packageDeal) {
        TextView place = createdView.findViewById(R.id.tv_item_place);
        place.setText(packageDeal.getPlace());
    }
}
