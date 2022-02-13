package DemoJenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoJenkins1 {

	WebDriver driver = null;

	@Test
	public void testCase1() {

		System.out.println("This is first test");
	}

	@Test
	public void testCase2() {
		System.out.println("This is second Test");
	}

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}

}
