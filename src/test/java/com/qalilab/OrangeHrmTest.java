package com.qalilab;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHrmTest {
    WebDriver driver;
    @BeforeMethod
    @Test
    public void setup(){
        //definir le chemin du web driver
        driver  = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }
    public void loginTest(){
        //Code de test
        //Localiser le champ de saisie de l'identifiant
        //entrer les données sur ces différents champs
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        //cliquer sur le bouton de connexion
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        //Vérifier si la page d'acceuil est bien chargée
        String pageTitle = driver.getTitle();
        assert pageTitle.contains("OrangeHRM");
    }
    //Cas négatif
    @Test
    public void casnegatif(){
        //definir le chemin du web driver
        driver  = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }

    public void falseloginTest(){
        //Code de test
        //Localiser le champ de saisie de l'identifiant
        //entrer les données sur ces différents champs
        driver.findElement(By.name("username")).sendKeys("fauxadmin");
        driver.findElement(By.name("password")).sendKeys("adminfaux");

        //cliquer sur le bouton de connexion
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        //Vérifier si la page d'acceuil est bien chargée
        String pageTitle = driver.getTitle();
        assert pageTitle.contains("Invalid credentials");
    }
    @Test
    //Gestion du personnel
    public void acces(){
        //definir le chemin du web driver
        driver  = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }
    public void ajouth() {
        //Code de test
        //Localiser le champ de saisie de l'identifiant
        //entrer les données sur ces différents champs
        //definir le chemin du web driver
        //driver  = new ChromeDriver();
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        //cliquer sur le bouton de connexion
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        //Vérifier si la page d'acceuil est bien chargée
        String pageTitle = driver.getTitle();
        assert pageTitle.contains("OrangeHRM");
        //Acceder à la page PIM
        driver.findElement(By.className("oxd-text oxd-text--span oxd-main-menu-item--name")).click();
        //Vérifier si la page PIM est bien chargée
        String pagePimTitle=driver.getTitle();
        assert pageTitle.contains("PIM");

        //CVliquer sur le bouton Add
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--secondary")).click();
        //Vérifier si la page add est bien chargée
        String pageAddTitle=driver.getTitle();
        assert pageTitle.contains("Add Employee");
        //Remplissage du formulaire
        driver.findElement(By.className("oxd-input oxd-input--active orangehrm-firstname")).sendKeys("SHURAIM");
        driver.findElement(By.className("oxd-input oxd-input--active orangehrm-middlename")).sendKeys("Son");
        driver.findElement(By.className("oxd-input oxd-input--active orangehrm-lastname")).sendKeys("Traore");
        driver.findElement(By.className("oxd-input oxd-input--active")).clear();
        driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("0101010101");
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--ghost")).click();
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space")).click();
    }


}
