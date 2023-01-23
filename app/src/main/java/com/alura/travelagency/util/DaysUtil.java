package com.alura.travelagency.util;

import androidx.annotation.NonNull;

public class DaysUtil {

    public static final String PLURAL = " days";
    public static final String ONE = " day";

    @NonNull
    public static String formattingToTxt(int periodLength) {
        if (periodLength > 1) {
            return periodLength + PLURAL;
        }
        return periodLength + ONE;
    }
}
