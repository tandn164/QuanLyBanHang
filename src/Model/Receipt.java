/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Receipt {

    String id_Receipt, id_Cus, id_Product, id_staff;
    double totalMoney, price;
    Date date;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId_Receipt() {
        return id_Receipt;
    }

    public void setId_Receipt(String id_Receipt) {
        this.id_Receipt = id_Receipt;
    }

    public String getId_Cus() {
        return id_Cus;
    }

    public void setId_Cus(String id_Cus) {
        this.id_Cus = id_Cus;
    }

    public String getId_Product() {
        return id_Product;
    }

    public void setId_Product(String id_Product) {
        this.id_Product = id_Product;
    }

    public String getId_staff() {
        return id_staff;
    }

    public void setId_staff(String id_staff) {
        this.id_staff = id_staff;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Receipt(String id_Receipt, String id_Cus, String id_Product, String id_staff, double totalMoney, Date date) {
        this.id_Receipt = id_Receipt;
        this.id_Cus = id_Cus;
        this.id_Product = id_Product;
        this.id_staff = id_staff;
        this.totalMoney = totalMoney;
        this.date = date;
    }

}
