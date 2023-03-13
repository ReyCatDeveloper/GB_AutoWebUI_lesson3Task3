package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.ProjectOperation.authorization;
import static org.example.ProjectOperation.logOut;
import static org.example.WebDriver.ProjectWebDriver.getChromeDriver;
import static org.example.WebDriver.ProjectWebDriver.webDriverStart;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //запуск
        webDriverStart("https://www.russianfood.com");
        //авторизация
        authorization();

        //переключение на вкладку "Рецепты"
        WebElement addRecipe = getChromeDriver().findElement(By.xpath("//a[text()=\"Рецепт\"]"));
        addRecipe.click();
        Thread.sleep(2000);

        //Название блюда
        WebElement inputName = getChromeDriver().findElement(By.xpath("//input[@name=\"recipe_title\"]"));
        inputName.sendKeys("Пробное блюдо");
        //Краткое описание блюда
        WebElement textareaSummary = getChromeDriver().findElement(By.xpath("//textarea[@name=\"recipe_announce\"]"));
        textareaSummary.sendKeys("Краткое описание");
        //Ингридиенты
        WebElement textareaIngrid = getChromeDriver().findElement(By.xpath("//textarea[@name=\"ingrid_text\"]"));
        textareaIngrid.sendKeys("Ингредиенты");
        //типы блюд
        WebElement ulMealType = getChromeDriver().findElement(By.xpath("//label[contains(text(),\"Типы\")]/following::ul[1]"));
        ulMealType.click();
        Thread.sleep(2000);
        WebElement ulMealTypeCrap = getChromeDriver().findElement(By.xpath("//li[contains(text(), \"Хреновина\")]" ));
        ulMealTypeCrap.click();                                                              //li[contains(text(),  "Хреновина")]

        //сохранить
        WebElement buttonSave = getChromeDriver().findElement(By.xpath("//input[@name=\"save\"]"));
        buttonSave.click();

        Thread.sleep(3000);
        logOut();


    }
}