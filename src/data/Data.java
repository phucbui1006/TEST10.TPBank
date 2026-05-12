/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
// Phuc ngu
import entity.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Data {

    public static List<Account> listAccount() {
        
        // Tạo 1 danh sách để tí đăng nhập 
        List<Account> list = new ArrayList<>();
        
        // add dữ liệu , tí nhập đúng tk mk capcha thì vào 
        list.add(new Account("0123456789", "hieu123456"));
        list.add(new Account("0123456789", "phuc123456"));
        list.add(new Account("0123456789", "cham123456"));
        list.add(new Account("0123456789", "hoang123456"));
        
        return list;
    }
}
