package org.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Project1\\driver\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.facebook.com/");
String title = d.getTitle();
System.out.println(title);
String currentUrl = d.getCurrentUrl();
System.out.println(currentUrl);
}
}
