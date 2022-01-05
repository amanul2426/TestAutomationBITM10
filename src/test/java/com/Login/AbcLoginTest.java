package com.Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AbcLoginTest {
    WebDriver driver;

    @BeforeMethod
    public void init_setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
    }

   @AfterMethod
    public void tear_Down(){
        driver.close();
    }

    @Test()
    public void login_TC001(){
        WebElement userID= driver.findElement(By.name("uid"));
        userID.clear();
        userID.sendKeys("mngr373512");

        WebElement password= driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("ymEzavE");

        WebElement logBtn= driver.findElement(By.name("btnLogin"));
        logBtn.click();
    }

    @Test()
    public void login_TC002(){
        WebElement userID= driver.findElement(By.name("uid"));
        userID.clear();
        userID.sendKeys("mngr373512asd");

        WebElement password= driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("ymEzavE12");

        WebElement logBtn= driver.findElement(By.name("btnLogin"));
        logBtn.click();
        driver.switchTo().alert().accept();
    }

    @Test()
    public void login_TC003(){
        WebElement userID= driver.findElement(By.name("uid"));
        userID.clear();
        userID.sendKeys("mngr373512");

        WebElement password= driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("ymEzavE12qw!");

        WebElement logBtn= driver.findElement(By.name("btnLogin"));
        logBtn.click();

        driver.switchTo().alert().accept();
    }


}
