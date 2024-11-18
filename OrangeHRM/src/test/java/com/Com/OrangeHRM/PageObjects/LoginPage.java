package com.Com.OrangeHRM.PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Com.OrangeHRM.ActionDriver.Action;
import com.Com.OrangeHRM.base.BaseClass;

public class LoginPage extends BaseClass{
	Action action=new Action();
	
			
	
	@FindBy(xpath="//input[@placeholder='Username']") 
    WebElement Username;
	
	@FindBy(xpath="//input[@placeholder='Password']") 
    WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement Login;

	public LoginPage()
	{
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@SuppressWarnings("static-access")
	public void Setusername() {
		
		action.click(getDriver(), Username);
		action.type(Username, prop.getProperty("uname"));
		
		
		
	}
	@SuppressWarnings("static-access")
	public void setpassword() {
		action.click(getDriver(), Password);
		action.type(Password, prop.getProperty("pswd"));
		
	}
	
	@SuppressWarnings("static-access")
	public void submit() {
		action.click(getDriver(), Login);
	}
	public void isAlertPresent(){ 
		try{
			Alert alert = getDriver().switchTo().alert();
        String Text = alert.getText();
        System.out.println(Text);
        alert.accept();
        Assert.assertTrue(alert.getText().contains("Thanks."));
		
	} catch (Exception e) {
	    //exception handling
	}
		
}
	
}
