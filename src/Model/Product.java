/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 */
public class Product {
    String id_Product, NameofProduct, Supplier, type;
    double price,total;
    int discount,quantity;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
 
    public Product(String id_Product, String NameofProduct, String Supplier, String type, double price, double total, int discount, int quantity) {
        this.id_Product = id_Product;
        this.NameofProduct = NameofProduct;
        this.Supplier = Supplier;
        this.type = type;
        this.price = price;
        this.total = total;
        this.discount = discount;
        this.quantity = quantity;
    }

    public String getId_Product() {
        return id_Product;
    }

    public void setId_Product(String id_Product) {
        this.id_Product = id_Product;
    }

    public String getNameofProduct() {
        return NameofProduct;
    }

    public void setNameofProduct(String NameofProduct) {
        this.NameofProduct = NameofProduct;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
}
