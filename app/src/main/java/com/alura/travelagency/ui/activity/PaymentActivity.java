package com.alura.travelagency.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alura.travelagency.R;
import com.alura.travelagency.model.TripPackage;
import com.alura.travelagency.util.CurrencyUtil;

import java.math.BigDecimal;

public class PaymentActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Payment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        setTitle(TITLE_APPBAR);

        TripPackage pkgSp = new TripPackage("São Paulo", "sao_paulo_sp", 2,
                new BigDecimal("243.99"));

        showPrice(pkgSp);

        Button btnPaymentPackage = findViewById(R.id.btn_checkout_payment);
        btnPaymentPackage.setOnClickListener(v -> {
            Intent intent = new Intent(PaymentActivity.this,
                    ResumeBookingActivity.class);
            startActivity(intent);
        });

    }
    private void showPrice(TripPackage aPkg) {
        TextView price = findViewById(R.id.tv_checkout_total_price);
        String brlCurrency = CurrencyUtil.formattingModelCurrency(aPkg.getPrice());
        price.setText(brlCurrency);
    }
}
