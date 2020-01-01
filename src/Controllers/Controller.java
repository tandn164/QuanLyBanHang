/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Account;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Controller {

    FileOutputStream fileOutputStream;
    DataOutputStream dataOutputStream;
    FileInputStream fileInputStream;
    DataInputStream dataInputStream;

    public void WriteFile(String userName, String passWord) {
        try {
            String data = userName.concat(":").concat(passWord);
            fileOutputStream = new FileOutputStream("./Data/DataOfAccount");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF(data);
            fileOutputStream.close();
            dataOutputStream.close();

        } catch (Exception e) {

        };

    }

    public ArrayList<Account> readFile(String file) {
        String data = "";
          Account account = new Account();
        String[] temp = new String[2];
        ArrayList<Account> listData = new ArrayList();
        try {
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
            data = dataInputStream.readLine();

            int j = 0;
            for (int i = 0; i < data.length(); i++) {
                if (data.charAt(i) == ':' || data.charAt(i) == ' ') {
                    j++;
                    continue;
                }
                temp[j] += data.charAt(i);
            }
          account.setUserName(temp[0]);
          account.setPassWord(temp[1]);
            listData.add(account);
            fileInputStream.close();
            dataInputStream.close();

        } catch (Exception e) {
        }
        return listData;
    }
}
