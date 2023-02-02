package com.alura.travelagency.ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alura.travelagency.R;
import com.alura.travelagency.model.Pack;
import com.alura.travelagency.util.CurrencyUtil;
import com.alura.travelagency.util.DateUtil;
import com.alura.travelagency.util.ResUtil;

public class BookingResumeActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Booking Details";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_resume);

        setTitle(TITLE_APPBAR);

        Intent intent = getIntent();
        if (intent.hasExtra("pack")) {
            final Pack pack = (Pack) intent.getSerializableExtra("pack");

            showDestination(pack);
            showDate(pack);
            showPlaceImg(pack);
            showPrice(pack);
        }
    }

    private void showPrice(Pack pack ){
        TextView price = findViewById(R.id.tv_resume_paymt_total);
        String brlCurrency = CurrencyUtil.formattingModelCurrency(pack.getPrice());
        price.setText(brlCurrency);
    }

    private void showPlaceImg(Pack pack) {
        ImageView image = findViewById(R.id.iv_resume_paymt_destination_bn);
        Drawable resumeBanner = ResUtil.returnDrawable(this, pack.getBanner());
        image.setImageDrawable(resumeBanner);
    }

    private void showDate(Pack pack) {
        TextView date = findViewById(R.id.tv_resume_paymt_period);
        String periodAsTxt = DateUtil.periodTxt(pack.getDays());
        date.setText(periodAsTxt);
    }

    private void showDestination(Pack pack) {
        TextView resumeDestination = findViewById(R.id.tv_resume_paymt_destination);
        resumeDestination.setText(pack.getDestination());
    }

}