package com.alura.travelagency.ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alura.travelagency.R;
import com.alura.travelagency.model.Pack;
import com.alura.travelagency.util.CurrencyUtil;
import com.alura.travelagency.util.DateUtil;
import com.alura.travelagency.util.DaysUtil;
import com.alura.travelagency.util.ResUtil;

public class PackageOverviewActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Overview";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_overview);

        setTitle(TITLE_APPBAR);

        Intent intent = getIntent();
        if (intent.hasExtra("pack")) {
            final Pack pack = (Pack) intent.getSerializableExtra("pack");

            showDestination(pack);
            showPlaceImg(pack);
            showDays(pack);
            showPrice(pack);
            showDate(pack);

            Button btnBookPackage = findViewById(R.id.btn_resume_payment);
            btnBookPackage.setOnClickListener(view -> {
                Intent intentPayment = new Intent(PackageOverviewActivity.this,
                        PaymentActivity.class);
                intentPayment.putExtra("pack", pack);
                startActivity(intentPayment);
            });
        }
    }

    private void showDate(Pack pack) {
        TextView tripDuration = findViewById(R.id.tv_resume_duration);
        String standardizeTripPeriod = DateUtil.periodTxt(pack.getDays());
        tripDuration.setText(standardizeTripPeriod);
    }

    private void showPrice(Pack pack) {
        TextView price = findViewById(R.id.tv_resume_price);
        String brlCurrency = CurrencyUtil.formattingModelCurrency(pack.getPrice());
        price.setText(brlCurrency);
    }

    private void showDays(Pack pack) {
        TextView days = findViewById(R.id.tv_resume_days);
        String daysByTxt = DaysUtil.formattingToTxt(pack.getDays());
        days.setText((daysByTxt));
    }

    private void showPlaceImg(Pack pack) {
        ImageView image = findViewById(R.id.iv_resume_pkg_banner);
        Drawable drawablePkg = ResUtil.returnDrawable(this, pack.getBanner());
        image.setImageDrawable((drawablePkg));
    }

    private void showDestination(Pack pack) {
        TextView place = findViewById(R.id.tv_resume_place);
        place.setText((pack.getDestination()));
    }
}