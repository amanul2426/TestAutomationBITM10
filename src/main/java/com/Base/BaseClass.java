package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;


public class BaseClass {
    public static WebDriver driver;

    public static void main(String[] args) {

        chrome_launch();
        open_URL("https://google.com");
        chrome_close();

        //edge_launch();
        //open_URL();
        //edge_close();

        //opera_launch();
        //open_URL();
        //opera_close();

    }

    public static void chrome_launch() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void edge_launch() {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();

    }

    public static void opera_launch() {
        System.setProperty("webdriver.opera.driver", "./src/main/resources/Drivers/operadriver.exe");
        driver = new OperaDriver();
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


    public static void chrome_close() {
        driver.close();
    }

    public static void chrome_quit() {
        driver.quit();
    }


    public static void edge_close() {
        driver.close();
    }

    public static void edge_quit() {
        driver.quit();
    }

    public static void opera_close() {
        driver.close();
    }

    public static void opera_quit() {
        driver.quit();
    }

    public static void open_URL(String URL) {
        driver.get(URL);
    }

}
