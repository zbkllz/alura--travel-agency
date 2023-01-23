package com.alura.travelagency.model;

import java.math.BigDecimal;

public class TripPackage {
    private final String place;
    private final String image;
    private final int days;
    private final BigDecimal price;

    public TripPackage(String place, String image, int days, BigDecimal price) {
        this.place = place;
        this.image = image;
        this.days = days;
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public String getImage() {
        return image;
    }

    public int getDays() {
        return days;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
