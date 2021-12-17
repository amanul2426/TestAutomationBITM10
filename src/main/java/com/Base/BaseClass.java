package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {
    public static WebDriver driver;

    public static void main(String[] args) {

        edge_launch();
        open_URL();
        edge_close();

        opera_launch();
        open_URL();
        opera_close();

    }

    public static void edge_launch() {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();

    }

    public static void opera_launch() {
        System.setProperty("webdriver.opera.driver", "./src/main/resources/Drivers/operadriver.exe");
        driver = new OperaDriver();
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

    public static void open_URL() {
        driver.get("https://google.com");
    }
}