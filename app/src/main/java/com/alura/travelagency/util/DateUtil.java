package com.alura.travelagency.util;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {

    public static final String DAY_N_MONTH = "dd/MM";

    @NonNull
    public static String periodTxt(int days) {
        Calendar arrivalDate = Calendar.getInstance();
        Calendar departureDate = Calendar.getInstance();
        departureDate.add(Calendar.DATE, days);
        SimpleDateFormat brDateFormatting = new SimpleDateFormat(DAY_N_MONTH);
        String formatDateArrival = brDateFormatting.format(arrivalDate.getTime());
        String formatDateDeparture = brDateFormatting.format(departureDate.getTime());
        return formatDateArrival + " - "
                + formatDateDeparture + " of "
                + departureDate.get(Calendar.YEAR);
    }
}
