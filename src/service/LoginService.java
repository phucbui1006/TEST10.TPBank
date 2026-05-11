/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import data.Data;
import entity.Account;
import java.util.ResourceBundle;
import utils.CapchaGenerator;
import utils.Icontants;
import utils.Validation;

/**
 *
 * @author admin
 */
public class LoginService {
    
    // hàm đăng nhập này hơi dài , vì in ra phải đúng ngôn ngữ mình chọn nên hơi lạ
    public void login(ResourceBundle re) {
        String account = Validation.getSting(re.getString("account"), re.getString("accountInvalid"), Icontants.ACCOUNT);
        String pass = Validation.getSting(re.getString("password"), re.getString("passwordInvalid"), Icontants.PASSWORD);
        
        // Gọi hàm random capcah để in ra cho ng dùng nhạp lại
        String createCapcha = CapchaGenerator.genCapcha(Icontants.CAPCHAR_LENGTH);
        
        // Hiển thị cái mã capcha đã random
        System.out.println(re.getString("captcha") + createCapcha);
        
        // kiểm tra xem đúng chưa ở class validation
        Validation.checkCapcha(re.getString("capcharInput"), re.getString("capchaInvalid"), createCapcha);
        
        // gọi hàm check info ở dưới
        if (checkInfo(account, pass)) {
            System.out.println(re.getString("success"));
        } else {
            System.out.println(re.getString("fail"));

        }
    }
    // Kiểm tra xem tk mk có trong dữ liệu hay k
    private boolean checkInfo(String acc, String pass) {
        
        for (Account acc1 : Data.listAccount()) { // lấy dữ liệu từ class Data để tìm lần lượt
            if (acc.equals(acc1.getAccount()) && pass.equals(acc1.getPassword())) { // so sánh nếu thấy thì break và return true
                break;
            } else { // không tìm thấy sẽ hiện fail
                return false;
            }
        }
        return true;
    }

}
