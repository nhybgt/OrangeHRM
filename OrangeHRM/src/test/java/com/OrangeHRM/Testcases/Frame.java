package com.OrangeHRM.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jquery.com");
		
		driver.switchTo().frame("Drahe");//move to frame
		
		WebElement click=driver.findElement(By.id("name"));
		
		Actions a= new Actions(driver);
		a.dragAndDrop(click, click);//will drag and drop frame
		
		driver.switchTo().defaultContent();//this for come out of the frame

		}

	}


