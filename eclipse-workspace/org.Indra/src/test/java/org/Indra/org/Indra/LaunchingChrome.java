package org.Indra.org.Indra;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {
		String exePath = "C:\\Users\\indra\\eclipse-workspace\\org.Indra\\DriverServers\\chromedriver.exe";	System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}
}