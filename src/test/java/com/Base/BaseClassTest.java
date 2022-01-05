package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassTest {
    public static WebDriver driver;

    public static String Chrome ="Chrome";
    public static String Edge ="Edge";
    public static String Opera ="Opera";


    public static void open_URL(String URL) {
        driver.get(URL);
    }


    //Chrome
    public static void chrome_launch() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public static void chrome_close() {
        if (driver != null) {
            driver.close();
        } else {
            System.out.println("Nothing to Close. No Browser found.");
        }

    }

    public static void chrome_quit() {
        driver.quit();
    }


    //Click on Element
    public static void clickOnElementBy_ID(String id){
        driver.findElement(By.id(id)).click();
    }
    public static void clickOnElementBy_Name(String Name){
        driver.findElement(By.name(Name)).click();
    }
    public static void clickOnElementBy_Xpath(String Xpath){
        driver.findElement(By.xpath(Xpath)).click();
    }
    public static void clickOnElementBy_Css(String Css){
        driver.findElement(By.cssSelector(Css)).click();
    }
    public static void clickOnElementByLinkText(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }

    //Clear Text filed
    public static void clearTextFieldByID(String id){
        driver.findElement(By.id(id)).clear();
    }
    public static void clearTextFieldByXpath(String xpath){
        driver.findElement(By.xpath(xpath)).clear();
    }
    public static void clearTextFieldByName(String name){
        driver.findElement(By.name(name)).clear();
    }
    public static void clearTextFieldByCss(String css){
        driver.findElement(By.cssSelector(css)).clear();
    }

    //Type on Element
    public static void typeOnElementBy_ID(String id, String value){
        driver.findElement(By.id(id)).sendKeys(value);
    }
    public static void typeOnElementBy_Name(String Name,String value){
        driver.findElement(By.name(Name)).sendKeys(value);
    }
    public static void typeOnElementBy_Xpath(String Xpath,String value){
        driver.findElement(By.xpath(Xpath)).sendKeys(value);
    }
    public static void typeOnElementBy_Css(String Css,String value){
        driver.findElement(By.cssSelector(Css)).sendKeys(value);
    }

    //Alert
    public static void alertAccept(){
        driver.switchTo().alert().accept();
    }
    public static void alertCancel(){
        driver.switchTo().alert().dismiss();
    }
    public static void typeOnAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    //Wait
    public static void smallWait() throws InterruptedException {
        Thread.sleep(3000);
    }
    public static void midWait() throws InterruptedException {
        Thread.sleep(7000);
    }
    public static void longWait() throws InterruptedException {
        Thread.sleep(10000);
    }
    public static void customWait(int MileSeconds) throws InterruptedException {
        Thread.sleep(MileSeconds);
    }



}




