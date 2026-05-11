/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {
    
    private static final Scanner sc = new Scanner(System.in);
    
    
    // Hmaf get in như bình thường , copy từ bìa khác qua cx đc
    public static int getInt(String enter_your_choice_, int min, int max) {
        do {            
            System.out.println(enter_your_choice_);
            try {
                int number = Integer.parseInt(sc.nextLine());
                if(number >= min && number<=max){
                    return number;
                }
                else{
                    System.out.println("Out range! enter 1 -> 3.");
                }
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        } while (true);
    }
    
    // Hàm getstring 
    public static String getSting (String info, String Error, String REGEX){
        do {            
            System.out.println(info);
            String str = sc.nextLine().trim();
            
            // Kiểm tra xem đúng form đã chuyền vào chưa, nếu là tk thì xem đủ 10 kí tự chưa ( truyền ở fide icontain)
            if(str.matches(REGEX)){
                return str;
            } else {
                System.out.println(Error);
            }
        } while (true);
    }
    
    // Hàm kiểm tra xem người dùng đã nhập đúng mã capha chưa
    public static boolean checkCapcha(String info,String error, String capchaOutput){
        while (true) {            
            System.out.println(info);
            String capcha = sc.nextLine().trim();
            
            // so sánh capcha nhập vào vs capcha random 
            if(capcha.equals(capchaOutput)){
                break;
            } else{
                System.out.println(error);
            }
        }
        return true;
    }
}
