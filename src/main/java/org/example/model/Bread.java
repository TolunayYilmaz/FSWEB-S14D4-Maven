package org.example.model;

public class Bread extends ProductForSale{
    private String title;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        title="Bread";
        System.out.println(title);
    }
    public String getTitle() {
        return title;
    }
}
