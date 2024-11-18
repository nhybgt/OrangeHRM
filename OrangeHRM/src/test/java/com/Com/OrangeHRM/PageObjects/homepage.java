package com.Com.OrangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Com.OrangeHRM.ActionDriver.Action;
import com.Com.OrangeHRM.base.BaseClass;

public class homepage extends BaseClass {
	Action action=new Action();

	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
			WebElement Admin;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement Add;
	
	
	
	public homepage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@SuppressWarnings("static-access")
	public  void SelectAdmin() throws InterruptedException {
		action.moveToElement(getDriver(), Admin);
		//action.click(getDriver(), Admin);
		Thread.sleep(2000);
		
		
		
	}
	
	@SuppressWarnings("static-access")
	public void add() {
		

		action.click(getDriver(), Add);
	}
	
}
