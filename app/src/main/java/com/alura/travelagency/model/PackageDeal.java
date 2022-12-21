package com.alura.travelagency.model;

import java.math.BigDecimal;

public class PackageDeal {
    private final String place;
    private final String image;
    private final int period;
    private final BigDecimal price;

    public PackageDeal(String place, String image, int period, BigDecimal price) {
        this.place = place;
        this.image = image;
        this.period = period;
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public String getImage() {
        return image;
    }

    public int getPeriod() {
        return period;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
