package com.alura.travelagency.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable returnDrawable(Context context, String drawableAsTxt) {
        Resources resources = context.getResources();
        int drawableId = resources.getIdentifier(drawableAsTxt,
                DRAWABLE, context.getPackageName());
        return resources.getDrawable(drawableId);

    }
}
