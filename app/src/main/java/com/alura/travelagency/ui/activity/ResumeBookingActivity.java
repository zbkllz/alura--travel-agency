package com.alura.travelagency.ui.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alura.travelagency.R;
import com.alura.travelagency.model.TripPackage;
import com.alura.travelagency.util.CurrencyUtil;
import com.alura.travelagency.util.DateUtil;
import com.alura.travelagency.util.ResUtil;

import java.math.BigDecimal;

public class ResumeBookingActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Booking Details";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_booking);

        setTitle(TITLE_APPBAR);

        TripPackage spPkg = new TripPackage("São Paulo", "sao_paulo_sp",
                2, new BigDecimal("243.99"));

        showDestination(spPkg);
        showDate(spPkg);
        showPlaceImg(spPkg);
        showPrice(spPkg);
    }

    private void showPrice(TripPackage aPkg) {
        TextView price = findViewById(R.id.tv_resume_paymt_total);
        String brlCurrency = CurrencyUtil.formattingModelCurrency(aPkg.getPrice());
        price.setText(brlCurrency);
    }


    private void showPlaceImg(TripPackage aPkg) {
        ImageView image = findViewById(R.id.iv_resume_paymt_destination_bn);
        Drawable resumeBanner = ResUtil.returnDrawable(this, aPkg.getBanner());
        image.setImageDrawable(resumeBanner);
    }

    private void showDate(TripPackage aPkg) {
        TextView date = findViewById(R.id.tv_resume_paymt_period);
        String periodAsTxt = DateUtil.periodTxt(aPkg.getDays());
        date.setText(periodAsTxt);
    }

    private void showDestination(TripPackage aPkg) {
        TextView resumeDestination = findViewById(R.id.tv_resume_paymt_destination);
        resumeDestination.setText(aPkg.getDestination());
    }

}