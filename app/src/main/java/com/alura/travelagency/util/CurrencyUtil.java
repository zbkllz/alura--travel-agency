package com.alura.travelagency.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtil {

    public static final String LANGUAGE = "pt";
    public static final String REGION = "br";
    public static final String STANDARD_US = "R$";
    public static final String STANDARD_BR = "R$ ";

    public static String formattingModelCurrency(BigDecimal value) {
        NumberFormat brlFormat = NumberFormat.getCurrencyInstance(
                new Locale(LANGUAGE, REGION));
        return brlFormat
                .format(value)
                .replace(STANDARD_US, STANDARD_BR);
    }
}