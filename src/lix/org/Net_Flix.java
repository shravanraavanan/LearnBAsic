package lix.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Net_Flix {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Learn_Basic\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		TakesScreenshot t=(TakesScreenshot)driver;
		File n=t.getScreenshotAs(OutputType.FILE);
		File s=new File("C:\\Users\\user\\eclipse-workspace\\Learn_Basic\\chrome driver\\screenshot\\netflix.png");
		FileHandler.copy(n,s);
		
		
		
	}

}
