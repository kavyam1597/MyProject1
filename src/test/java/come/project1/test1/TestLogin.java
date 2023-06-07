package come.project1.test1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.p1.HomeScreen;
import com.pages.p1.Login;

public class TestLogin {
	
	WebDriver driver;
	Login login;
	HomeScreen home;
	
	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\0022IV744\\Desktop\\Mine\\FST\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	

	@Test
	public void test_HomeScreen_Appears_Correct() {
		login = new Login(driver);
		
		//verify login page error message
		/*String loginErrorMessage =login.getLoginErrorMessage();
		System.out.println(loginErrorMessage);
		//query? necessity of assert here if we haven't give text in the method where element is fetched
		Assert.assertTrue(loginErrorMessage.contains("Invalid credentials")); */
		
		//To login to application
		login.loginToApplication("Admin", "admin123");
		
		//go to home screen
		home = new HomeScreen(driver);
		
		//Verify the application title
		Assert.assertTrue(home.getPageTitle().contains("OrangeHRM"));
	}

}
