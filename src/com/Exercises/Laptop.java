package com.Exercises;

import java.util.Date;

public class Laptop {
    String brand;
    Date date;

    public Laptop(String brand, Date date) {
        this.brand = brand;
        this.date = date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", date=" + date +
                '}';
    }
}
