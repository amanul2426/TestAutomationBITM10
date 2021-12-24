package com.BasicOperation;

import com.Base.BaseClass;

public class TitleURL extends BaseClass {
    public static void main(String[] args) {

        chrome_launch();
        open_URL("https://google.com/");
        title_verification("Your Store");
        url_verification("https://demo.opencart.com/");
        chrome_close();

        //edge_launch();
        //open_URL("https://google.com/");
        //title_verification();
        //url_verification();
        //edge_close();


        //opera_launch();
        //open_URL("https://demo.opencart.com/");
        //title_verification();
        //url_verification();
        //opera_close();


    }

    private static void url_verification() {
    }

    public static void title_verification(String ExpectedTitle){
       //String ExpectedTitle="My Store";
       String ActualTitle= driver.getTitle();       //return string value


       if(ExpectedTitle.equals(ActualTitle)){
           System.out.println("title Verification passed");
       }
    else
        System.out.println("Title Verification Failed !!! "+"Actual title is: "+ ActualTitle);
    }


    public static void url_verification(String ExpectedUrl){
        String ActualUrl= driver.getCurrentUrl();

        if(ExpectedUrl.equals(ActualUrl)){
            System.out.println("Url Verification Passed");
        }
        else
            System.out.println("Url Verification Failed !!! "+"Actual Url is: "+ActualUrl);
    }


}

