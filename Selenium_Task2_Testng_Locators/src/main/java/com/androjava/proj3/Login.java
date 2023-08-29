package com.androjava.proj3;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=3)
	public void dologin()
	{
		WebElement webElement=App.driver.findElement(By.id("email" ));
	  webElement.sendKeys("a@gmail.com");
	  
	  

		WebElement webElement1=App.driver.findElement(By.id("pass" ));
	  webElement1.sendKeys("aaa");
	  

		App.driver.findElement(By.name("login" )).click();
	  
	
	}

}
