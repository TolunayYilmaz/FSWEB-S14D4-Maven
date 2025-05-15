package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] arr = new ProductForSale[3];
        arr[0] = new Chocolate("Chocolate", 1, "lezziz");
        arr[1] = new Coke("Coke", 1, "lezziz");
        arr[2] = new Bread("Bread", 1, "lezziz");
        listProducts(arr);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product:products){

            product.showDetails();
        }
    }
}