package com.maven.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Maven");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	}

}
