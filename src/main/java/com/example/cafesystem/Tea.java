package com.example.cafesystem;

public class Tea {
    private String type;
    private String size;
    private String customization;
    private double total = 0;

    public Tea(String type, String size, String customization) {
        this.type = type;
        this.size = size;
        this.customization = customization;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCustomization() {
        return customization;
    }

    public void setCustomization(String customization) {
        this.customization = customization;
    }

    public double getTotal() {
        return total;
    }

    public void addTotal(double total) {
        this.total += total;
    }

    @Override
    public String toString() {
        return "Tea [type=" + type + ", size=" + size + ", customization=" + customization + ", total=" + total + "]";
    }
}
