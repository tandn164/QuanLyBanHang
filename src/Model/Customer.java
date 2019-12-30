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
public class Customer {
    String id_Cus, addr, Name;

    public Customer(String id_Cus, String addr, String Name) {
        this.id_Cus = id_Cus;
        this.addr = addr;
        this.Name = Name;
    }

    public String getId_Cus() {
        return id_Cus;
    }

    public void setId_Cus(String id_Cus) {
        this.id_Cus = id_Cus;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
