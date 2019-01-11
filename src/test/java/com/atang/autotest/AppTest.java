package com.atang.autotest;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AppTest {
	
	@Test
	public void testGoogle() {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.ca");

		WebElement title = driver.findElement(By.xpath("/html/head/title"));

		assertEquals("Google", title.getAttribute("innerHTML"));

		driver.close();
	}

}
