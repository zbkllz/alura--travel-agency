package com.alura.travelagency.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.alura.travelagency.R;
import com.alura.travelagency.model.Pack;
import com.alura.travelagency.util.CurrencyUtil;
import com.alura.travelagency.util.DaysUtil;
import com.alura.travelagency.util.ResUtil;

import java.util.List;

public class PackagesListAdapter extends BaseAdapter {

    private final List<Pack> packs;
    private final Context context;

    public PackagesListAdapter(List<Pack> packs, Context context) {

        this.packs = packs;
        this.context = context;
    }

    @Override
    public int getCount() {
        return packs.size();
    }

    @Override
    public Pack getItem(int position) {
        return packs.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View createdView = LayoutInflater.from(context)
                .inflate(R.layout.item_package, parent, false);

        Pack pack = this.packs.get(position);

        showPlace(createdView, pack);
        showImage(createdView, pack);
        showDays(createdView, pack);
        showPrices(createdView, pack);

        return createdView;
    }

    private void showPrices(View createdView, Pack pack) {
        TextView price = createdView.findViewById(R.id.tv_item_price);
        String usd = CurrencyUtil.formattingModelCurrency(pack.getPrice());
        price.setText(usd);
    }

    private void showDays(View createdView, Pack pack) {
        TextView period = createdView.findViewById(R.id.tv_item_period);
        String periodAsTxt = DaysUtil.formattingToTxt(pack.getDays());
        period.setText(periodAsTxt);
    }

    private void showImage(View createdView, Pack pack) {
        ImageView image = createdView.findViewById(R.id.iv_item_place_pkg);
        Drawable drawableImagePkg = ResUtil
                .returnDrawable(context, pack.getBanner());
        image.setImageDrawable(drawableImagePkg);
    }

    private void showPlace(View createdView, Pack pack) {
        TextView place = createdView.findViewById(R.id.tv_item_place);
        place.setText(pack.getDestination());
    }
}
