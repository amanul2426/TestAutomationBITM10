package com.OpenCart;

import com.Base.BaseClassTest;


public class Login extends BaseClassTest {
    public static void main(String[] args) {
        String Chrome="Chrome";
        chrome_launch();
        open_URL("https://demo.opencart.com/index.php?route=account/login");
        Login_TC_001();
        Login_TC_002();
        chrome_close();

    }




    public static void Login_TC_001(){

        //Email
        clearTextFieldByID("input-email");
        typeOnElementBy_ID("input-email","invalid@wrong.com");


        //Password
        clearTextFieldByID("input-password");
        typeOnElementBy_ID("input-password","123456789");


        //Click on Login
        clickOnElementBy_Xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");


    }


    public static void Login_TC_002(){

        //Email
        clearTextFieldByID("input-email");
        typeOnElementBy_ID("input-email","user101@gmail.com.com");


        //Password
        clearTextFieldByID("input-password");
        typeOnElementBy_ID("input-password","123456");


        //Click on Login
        clickOnElementBy_Xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");



    }

}
