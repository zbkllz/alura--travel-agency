package com.alura.travelagency.model;

import java.math.BigDecimal;

public class TripPackage {
    private final String destination;
    private final String banner;
    private final int days;
    private final BigDecimal price;

    public TripPackage(String destination, String banner, int days, BigDecimal price) {
        this.destination = destination;
        this.banner = banner;
        this.days = days;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public String getBanner() {
        return banner;
    }

    public int getDays() {
        return days;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
