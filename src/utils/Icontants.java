/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author admin
 */
public class Icontants {
    
    // class này để quy ước các giá trị cố định
    
    public static int CAPCHAR_LENGTH = 5; // độ dài của mã capcha cố định là 5
    public static String ACCOUNT = "^[0-9]{10}$"; // Tài khoản ngân hàng từ 0-9 và chỉ có 10 kí tự
    public static String PASSWORD = "^(?=.*[a-z])(?=.*\\d)(?=.*[\\W_])[a-z\\d\\W_]{8,31}$"; // có chữ thường, có số, kí tự đặc biệt và gồm 8-31 kí tự
}
