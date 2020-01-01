/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybanhang;

import Model.Account;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Test {

    FileOutputStream fileOutputStream;
    DataOutputStream dataOutputStream;
    FileInputStream fileInputStream;
    DataInputStream dataInputStream;
    File file;

    public ArrayList<Account> readFileDataAccount() {
//        String data = "";
        Account account = new Account();
        String[] temp = new String[2];
        ArrayList<Account> listData = new ArrayList();
        
        try {
            FileOutputStream fos= new FileOutputStream("D:/NetBeanProjects/QuanLyBanHang/src/quanlybanhang/Account.bin");
            DataOutputStream dos= new DataOutputStream(fos);
            
            dos.writeInt(10);
            fos.close(); 
            dos.close();
            
            FileInputStream fis = new FileInputStream("D:/NetBeanProjects/QuanLyBanHang/src/quanlybanhang/Account.bin");
            DataInputStream dis = new DataInputStream(fis);
            
            int x= dis.readInt();
            fis.close();
            dis.close();
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("File invalid! " + e.getMessage());
        }
        return listData;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.readFileDataAccount();
    }

}
