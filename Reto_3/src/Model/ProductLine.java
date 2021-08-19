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
public class ProductLine {
    
    private int productType;
    private Product product;

    public ProductLine(int productType, Product product) {
        this.productType = productType;
        this.product = product;
    }

    public ProductLine() {
    }
    
    
    /**
     * @return the productType
     */
    public int getProductType() {
        return productType;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductType(int productType) {
        this.productType = productType;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
}
