/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import java.util.Locale;
import java.util.ResourceBundle;
import service.LoginService;
import utils.Validation;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Vòng lặp chọn ngôn ngữ sẽ trỏ đến class Language
        while (true) {
            System.out.println("1. English.");
            System.out.println("2. Vietnamese.");
            System.out.println("3. Exit program.");

            int choice = Validation.getInt("Enter your choice: ", 1, 3);

            switch (choice) {
                case 1: {
                    System.out.println("======= Tien phong bank ========");

                    // Hàm gọi từ java nên gõ đúng , en là tên cuối của class Language_en
                    Locale.setDefault(new Locale("en", "US"));
                    break;
                }
                case 2: {
                    Locale.setDefault(new Locale("vi", "VN"));
                    break;
                }
                case 3: {
                    System.out.println("Thank You!!!");
                    System.exit(0);
                    break;
                }

            }
            // Gọi từ thư viện java không liên quan đến file nào cả
            ResourceBundle resourceBundle = ResourceBundle.getBundle("language/Language");
            new LoginService().login(resourceBundle);
        }

    }

}
