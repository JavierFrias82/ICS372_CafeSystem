package com.example.cafesystem;

public class Coffee {
    private String type;
    private String size;
    private String customization;
    private double total = 0;

    public Coffee(String type, String size, String customization) {
        this.type = type;
        this.size = size;
        this.customization = customization;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCustomization(String customization) {
        this.customization = customization;
    }

    public void addTotal(double total) {
        this.total += total;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getCustomization() {
        return customization;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Coffee [type=" + type + ", size=" + size + ", customization=" + customization
                + "]";
    }
}
