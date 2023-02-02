package com.alura.travelagency.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alura.travelagency.R;
import com.alura.travelagency.model.Pack;
import com.alura.travelagency.util.CurrencyUtil;

public class PaymentActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Payment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        setTitle(TITLE_APPBAR);

        Intent intent = getIntent();
        if (intent.hasExtra("pack")) {
            final Pack pack = (Pack) intent.getSerializableExtra("pack");

            showPrice(pack);

            Button btnPaymentPackage = findViewById(R.id.btn_checkout_payment);
            btnPaymentPackage.setOnClickListener(view -> {
                Intent intentBookingResume = new Intent(PaymentActivity.this,
                        BookingResumeActivity.class);
                intentBookingResume.putExtra("pack", pack);
                startActivity(intentBookingResume);
            });
        }
    }

    private void showPrice(Pack pack) {
        TextView price = findViewById(R.id.tv_checkout_total_price);
        String brlCurrency = CurrencyUtil.formattingModelCurrency(pack.getPrice());
        price.setText(brlCurrency);
    }
}
