package com.Com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Com.OrangeHRM.ActionDriver.Action;
import com.Com.OrangeHRM.base.BaseClass;

public class DasboradApplyLeave  extends BaseClass{
	Action action =new Action();
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	WebElement Toaster;
	
	
	public DasboradApplyLeave() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@SuppressWarnings("static-access")
	public void dashbodleave() {
		action.click(getDriver(), Toaster);
	}

}
