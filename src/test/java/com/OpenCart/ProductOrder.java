package com.OpenCart;

import com.Base.BaseClassTest;

public class ProductOrder extends BaseClassTest {
    public static void main(String[] args) {
        String Browser="Chrome";
        chrome_launch();
        open_URL("https://demo.opencart.com/");
        ProductOrder_TC_001();

    }

    public static void ProductOrder_TC_001(){
        //Step 1: go to Login page and Login
        //Email
        clearTextFieldByID("input-email");
        typeOnElementBy_ID("input-email","user101@gmail.com.com");


        //Password
        clearTextFieldByID("input-password");
        typeOnElementBy_ID("input-password","123456");


        //Click on Login
        clickOnElementBy_Xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");


        //Step 2: Go to Home page
        clickOnElementBy_Xpath("//*[@id=\"logo\"]/h1/a");


        //Step 3: Select Macbook and send to Add to Cart

        //Step 4: Open Shopping cart and go to Checkout

        //Step 5: Click Checkout
    }
}
