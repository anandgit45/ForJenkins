package com.tnq.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\PracticeSession\\Driver3\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("http://demo.guru99.com/test/upload/");
		 WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		 uploadFile.sendKeys("C:\\Users\\Arun\\Desktop\\Software Testing.pdf");
	}
}
