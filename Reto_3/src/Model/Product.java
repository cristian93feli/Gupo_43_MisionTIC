/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author maverick
 */
public class Product {
    
    private int code;
    private String name;
    private float price;
    private int quantity;
    private boolean stock;

    public Product(int code, String name, float price, int quantity, boolean stock) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.stock = stock;
    }

    public Product() {
    }
    
    

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the stock
     */
    public boolean isStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(boolean stock) {
        this.stock = stock;
    }
    
    
    
}
