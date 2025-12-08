package com.example.cafesystem;
import java.util.List;
import java.util.ArrayList;

public class Order {
    private String orderName;
    private List<Coffee> coffees;
    private List<Tea> teas;
    private List<Croissant> croissants;
    private List<Muffin> muffins;
    private List<Cookie> cookies;
    private int orderCount = 0;
    private double total = 0;
    private String status = "Pending";

    public Order(String name) {
        this.coffees = new ArrayList<Coffee>();
        this.croissants = new ArrayList<Croissant>();
        this.teas = new ArrayList<Tea>();
        this.muffins = new ArrayList<Muffin>();
        this.cookies = new ArrayList<Cookie>();
        this.orderName = name;
    }



    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
    public List<Coffee> getCoffees() {
        return coffees;
    }

    public List<Tea> getTeas() {
        return teas;
    }

    public List<Croissant> getCroissants() {
        return croissants;
    }

    public List<Muffin> getMuffins() {
        return muffins;
    }

    public List<Cookie> getCookies() {
        return cookies;
    }

    public String getOrderName() {
        return orderName;
    }

    public int getOrderCount() {
        return orderCount;
    }
    public void setOrderName(String name) {
        this.orderName = name;
    }

    public void addCoffee(Coffee coffee) {
        orderCount++;
        coffees.add(coffee);
    }

    public void addTea(Tea tea) {
        orderCount++;
        teas.add(tea);
    }

    public void addCroissant(Croissant croissant) {
        orderCount++;
        croissants.add(croissant);
    }

    public void addMuffin(Muffin muffin) {
        orderCount++;
        muffins.add(muffin);
    }

    public void addCookie(Cookie cookie) {
        orderCount++;
        cookies.add(cookie);
    }

    public void setTotal(double total) {
        this.total += total;
    }

    public double getTotal(){
        return this.total;
    }

    @Override
    public String toString() {
        String list = "";
        for(int i = 0; i < coffees.size(); i++) {
            //System.out.println(coffees.get(i).toString());
            list += coffees.get(i).getType();
        }
        for(int i = 0; i < teas.size(); i++) {
            //System.out.println(teas.get(i).toString());
            list += teas.get(i).getType();
        }
        for(int i = 0; i < croissants.size(); i++) {
            //System.out.println(croissants.get(i).toString());
            list += croissants.get(i).getType();
        }
        for(int i = 0; i < muffins.size(); i++) {
            //System.out.println(muffins.get(i).toString());
            list += muffins.get(i).getType();
        }
        for(int i = 0; i < cookies.size(); i++) {
            //System.out.println(cookies.get(i).toString());
            list += cookies.get(i).getType();
        }
        return list;
    }
}
