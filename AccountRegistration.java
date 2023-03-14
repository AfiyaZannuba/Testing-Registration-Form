package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountRegistration {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
                String id_FirstName = "input-firstname";
                String id_LastName = "input-lastname";
                String id_Email = "input-email";
                String id_Telephone = "input-telephone";
                String id_Password = "input-password";
                String id_ConfirmPwd = "input-confirm";
                String xpath_Newsletter = "(//input[@name='newsletter'])[1]";
                String name_Agree = "agree";
                String xpath_Continue = "//input[@value='Continue']";
                String xpath_Text = "//div[@id='content']//p";

                driver.findElement(By.id(id_FirstName)).sendKeys("Afiya");
        driver.findElement(By.id(id_LastName)).sendKeys("Zannuba");
        driver.findElement(By.id(id_Email)).sendKeys("afiya.zannubaa@gmail.com");
        driver.findElement(By.id(id_Telephone)).sendKeys("7033445566");
        driver.findElement(By.id(id_Password)).sendKeys("Afiya");
        driver.findElement(By.id(id_ConfirmPwd)).sendKeys("Afiya");

        driver.findElement(By.xpath(xpath_Newsletter)).click();
        driver.findElement(By.name(name_Agree)).click();
        driver.findElement(By.xpath((xpath_Text))).click();

            }
        }

