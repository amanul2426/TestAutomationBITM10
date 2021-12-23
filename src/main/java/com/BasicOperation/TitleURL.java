package com.BasicOperation;

import static com.Base.BaseClass.*;

public class TitleURL {
    public static void main(String[] args) {

        chrome_launch();
        //open_URL("https://demo.opencart.com/");
        //open_URL("https://google.com/");
        //title_verification();
        //url_verification();
        //chrome_close();

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

    public static void title_verification(){
       //String ExpectedTitle="My Store";
        String ExpectedUrl= "https://demo.opencart.com/";

       //String ActualTitle= driver.getTitle();       //return string value
        String ActualUrl= driver.getCurrentUrl();

       //System.out.println(ActualTitle);

       if(ExpectedUrl.equals(ActualUrl)){
           System.out.println("Url Verification passed");
       }
    else
        System.out.println("Title Verification Failed !!! "+"Actual title is: "+ ActualUrl);
    }


}
