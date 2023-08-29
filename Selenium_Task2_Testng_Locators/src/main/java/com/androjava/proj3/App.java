package com.androjava.proj3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */ 
public class App 
{
	
 static WebDriver driver=null;
	@Test(priority=1)
	public void dosetup() {
		
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\MUHAMMAD ZEESHAN\\eclipse-workspace\\proj3\\src\\main\\java\\drivers\\geckodriver.exe" );
			
     		 driver=new FirefoxDriver();
		
	}
	
	@Test(priority=2)
	public void openBrowser()
	{
  		driver.get( "https://www.facebook.com/");

	}
	@Test
	public void login()
	{
		
		
	}
	
    public static void main( String[] args )
    {
     //   System.out.println( "Hello World!" );
   
      	//	System.out.println(driver.getTitle());
    }
}


