package com.example.cafesystem;

public class Cookie {
    private String type;
    private double total = 0;

    public Cookie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTotal() {
        return total;
    }

    public void addTotal(double total) {
        this.total += total;
    }

    @Override
    public String toString() {
        return "Cookie [type=" + type + ", total=" + total + "]";
    }
}
