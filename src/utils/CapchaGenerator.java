/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;

/**
 *
 * @author admin
 */
public class CapchaGenerator {
    
    // Hàm này để in tất cả các kí tự có 0-9 a-z để tí ramdom lấy mã capcha
    public static String create() {
        String digit = "0123456789";
        
        String str = "";

        for (char i = 'A'; i <= 'Z'; i++) {
            str += i;
        }
        // 0-9,A-Z,a-z
        return str + digit + str.toLowerCase();
    }
    
    // Hàm ramdom lấy 5 trong tất cả các kí tự bên trên
    public static String genCapcha(int lenght) {
        Random rd = new Random();
        
        // gọi hàm bên trên 
        String chuoi = create();
        
        
        String numberall = "";
        for (int i = 0; i < lenght; i++) {
            // Lấy random vị trí từ 0 - độ dài của chuỗi
            numberall += chuoi.charAt(rd.nextInt(chuoi.length()));   
        }
        return numberall;
    }
    
}
