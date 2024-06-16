package com.ToolsQA;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Browserinit {
	
	public static String browser=" ";
	public static WebDriver driver; 
	
	public static void browserlaunch() throws IOException {
	
		FileReader fr = new FileReader("C:\\Users\\pc\\eclipse-workspace\\DemoQA\\src\\test\\resources\\Utilities\\Com.BrowserInitate") ;
		Properties prop = new Properties();
		prop.load(fr);
		
		String browser = prop.getProperty("browser");
			if(browser!=null) {
			if(browser.equalsIgnoreCase("chrome")) 
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		}			
		}
}
