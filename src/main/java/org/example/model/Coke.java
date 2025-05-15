package org.example.model;

public class Coke extends ProductForSale{
    private String title;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        title="Coke";
     System.out.println(title);
    }
    public String getTitle() {
        return title;
    }
}
