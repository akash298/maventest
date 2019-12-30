package com.automation.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver;
    	System.setProperty("webdriver.chrome.driver","C://Users//DELL//Desktop//driver//chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.get("https://www.google.com");
        System.out.println( "Hello World!" );
    }
}
