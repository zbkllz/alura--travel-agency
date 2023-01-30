package com.alura.travelagency.ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alura.travelagency.R;
import com.alura.travelagency.model.TripPackage;
import com.alura.travelagency.util.CurrencyUtil;
import com.alura.travelagency.util.DateUtil;
import com.alura.travelagency.util.DaysUtil;
import com.alura.travelagency.util.ResUtil;

import java.math.BigDecimal;

public class ResumePackageActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Overview";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_package);

        setTitle(TITLE_APPBAR);

        TripPackage pkgSp = new TripPackage("São Paulo", "sao_paulo_sp", 2,
                new BigDecimal("243.99"));

        showDestination(pkgSp);
        showPlaceImg(pkgSp);
        showDays(pkgSp);
        showPrice(pkgSp);
        showDate(pkgSp);

        Button btnBookPackage = findViewById(R.id.btn_resume_payment);
        btnBookPackage.setOnClickListener(v -> {
            Intent intent = new Intent(ResumePackageActivity.this,
                    PaymentActivity.class);
            startActivity(intent);
        });
    }

    private void showDate(TripPackage aPkg) {
        TextView tripDuration = findViewById(R.id.tv_resume_duration);
        String standardizeTripPeriod = DateUtil.periodTxt(aPkg.getDays());
        tripDuration.setText(standardizeTripPeriod);
    }

    private void showPrice(TripPackage aPkg) {
        TextView price = findViewById(R.id.tv_resume_price);
        String brlCurrency = CurrencyUtil.formattingModelCurrency(aPkg.getPrice());
        price.setText(brlCurrency);
    }

    private void showDays(TripPackage aPkg) {
        TextView days = findViewById(R.id.tv_resume_days);
        String daysByTxt = DaysUtil.formattingToTxt(aPkg.getDays());
        days.setText((daysByTxt));
    }

    private void showPlaceImg(TripPackage aPkg) {
        ImageView image = findViewById(R.id.iv_resume_pkg_banner);
        Drawable drawablePkg = ResUtil.returnDrawable(this, aPkg.getBanner());
        image.setImageDrawable((drawablePkg));
    }

    private void showDestination(TripPackage aPkg) {
        TextView place = findViewById(R.id.tv_resume_place);
        place.setText((aPkg.getDestination()));
    }
}