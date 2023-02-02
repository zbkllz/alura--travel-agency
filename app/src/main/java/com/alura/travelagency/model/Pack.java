package com.alura.travelagency.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pack implements Serializable {
    private final String destination;
    private final String banner;
    private final int days;
    private final BigDecimal price;

    public Pack(String destination, String banner, int days, BigDecimal price) {
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
