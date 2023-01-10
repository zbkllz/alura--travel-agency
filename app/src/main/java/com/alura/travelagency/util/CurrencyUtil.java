package com.alura.travelagency.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtil {

    public static final String LANGUAGE = "en";
    public static final String REGION = "us";

    public static String formatModelCurrency(BigDecimal value) {
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale(LANGUAGE, REGION));
        return usFormat.format(value);
    }
}

