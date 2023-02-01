package GenericLibraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import pomRepository.HomePage;


public class BaseDocument {

	public WebDriver driver;
	public SoftAssert sa;
	@Parameters("browsername")
	@BeforeClass
	public void openBrowser(@Optional("chrome") String browsername) throws InterruptedException {
		if(browsername.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			throw new InvalidBrowserName();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get(GenericLibraries.ToReadTheFile.frompptyfile("url"));
		driver.get("http://elftestingserver/domain/");
		HomePage hp=new HomePage(driver);
		//hp.getButton().click();
		hp.getInsurance().click();
		String title = driver.getTitle();
		String currentid=driver.getWindowHandle();
		String id="";
		Set<String> handle = driver.getWindowHandles();
		for(String winid:handle) {
			driver.switchTo().window(winid);
			if(!(driver.getTitle()).equals(title)) {
				id=winid;
			}
		} 

		Thread.sleep(5000);
		driver.switchTo().window(id);
		hp.getUsername().click();
		hp.getUsername().sendKeys("555");
		//Thread.sleep(1000);
		//hp.getUsername().sendKeys(GenericLibraries.ToReadTheFile.frompptyfile("username"));
		hp.getPassword().click();
		hp.getPassword().sendKeys("666");
		//Thread.sleep(1000);
		//hp.getPassword().sendKeys(GenericLibraries.ToReadTheFile.frompptyfile("pws"));
		hp.getLogin().click();
		//Thread.sleep(1000);
		sa=new SoftAssert();
	}

	@AfterClass(alwaysRun = true)
	public void quitBrowser() {
		driver.quit();
	}
}
class InvalidBrowserName extends RuntimeException {
	public InvalidBrowserName() {
		super("name of the browser is invalid");
	}
}




