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
public class Staff {
    String id_Staff, Name, addr, Ident ;
    double totalTimeOfMonth, salary;

    public Staff(String id_Staff, String Name, String addr, String Identification , double totalTimeOfMonth, double salary) {
        this.id_Staff = id_Staff;
        this.Name = Name;
        this.addr = addr;
        this.Ident  = Identification;
        this.totalTimeOfMonth = totalTimeOfMonth;
        this.salary = salary;
    }

    public String getId_Staff() {
        return id_Staff;
    }

    public void setId_Staff(String id_Staff) {
        this.id_Staff = id_Staff;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getIdent() {
        return Ident;
    }

    public void setIdent(String Ident) {
        this.Ident = Ident;
    }

    public double getTotalTimeOfMonth() {
        return totalTimeOfMonth;
    }

    public void setTotalTimeOfMonth(double totalTimeOfMonth) {
        this.totalTimeOfMonth = totalTimeOfMonth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
