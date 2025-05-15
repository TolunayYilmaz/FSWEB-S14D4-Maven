package org.example.model;

public class Chocolate extends ProductForSale {
    private String title;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        title="Chocolate";
        System.out.println(title);
    }

    public String getTitle() {
        return title;
    }
}
