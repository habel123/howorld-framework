package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterNameAndBirthdayPagePO{

    // Stage 1 Element Locator
    @FindBy(id = "inputName")
    public static WebElement InputNameField;

    @FindBy(id = "inputBirthday")
    public static WebElement InputBirthdayField;

    @FindBy(id = "submitButton")
    public static WebElement submitButton;


    // Stage 2 - Initialise web elements using selenium webdriver
    public EnterNameAndBirthdayPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    // Stage 3 -  Page Specific Methode
    public void enterInputName(String Name){
        InputNameField.sendKeys(Name);

    }

    public void enterInputBirthday(String Birthday){
        InputBirthdayField.sendKeys(Birthday);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }



}
