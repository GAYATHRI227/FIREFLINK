package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//img[contains(@alt,'Mohan Life_Insurance')]/..//button[@class='outline-button-button button']/../..") private WebElement button;
	public WebElement getButton() {
		return button;
	}
	@FindBy(xpath = "//img[@alt='Mohan Life_Insurance_Management_System']") private WebElement insurance;
	public WebElement getInsurance() {
		return insurance;
	}
	@FindBy(name = "username")private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	@FindBy(name = "password")private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[text()='login']")private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	
    
	
	}


