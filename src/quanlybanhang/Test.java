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
        file = new File("./Account.txt");
        if (!file.exists()) {
            System.out.println("File isnt exists");
        }
        try {
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
            fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            int data = fileInputStream.read();
            if (data == -1) {
                fileOutputStream.write("Hello AnhThu".getBytes());
                fileOutputStream.close();
                dataOutputStream.close();
            } else {
                System.out.println("content of file: " + data);
            }

//            int j = 0;
//            for (int i = 0; i < data.length(); i++) {
//                if (data.charAt(i) == ':' || data.charAt(i) == ' ') {
//                    j++;
//                    continue;
//                }
//                temp[j] += data.charAt(i);
//            }
//            account.setUserName(temp[0]);
//            account.setPassWord(temp[1]);
//            listData.add(account);
            fileInputStream.close();
            dataInputStream.close();

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
