package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.WebDriver.ProjectWebDriver.getChromeDriver;

public class Project {
    public static WebElement enterButton = getChromeDriver().findElement(By.xpath("//*[@id=\"user_login_form_btn\"]"));
    public static WebElement loginInput = getChromeDriver().findElement(By.xpath("//table//input[@name=\"username\"]"));
    public static WebElement passwordInput = getChromeDriver().findElement(By.xpath("//table//input[@name=\"password\"]"));
    public static WebElement rememberUserCheckbox = getChromeDriver().findElement(By.xpath("//table//input[@name=\"autologin\"]"));
    public static WebElement loginButton = getChromeDriver().findElement(By.xpath("//table//input[@name=\"login\"]"));



}
