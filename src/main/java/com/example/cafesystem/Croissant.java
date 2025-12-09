package com.example.cafesystem;

public class Croissant {
    private String type;
    private double total = 0;

    public Croissant(String type) {
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
        return "Croissant [type=" + type + ", total=" + total + "]";
    }
}
