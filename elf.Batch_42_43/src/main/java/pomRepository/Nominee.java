package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nominee {
	 public  Nominee(WebDriver driver) {
		    PageFactory.initElements(driver,this);	
	 }
		
	@FindBy(xpath = "//a[text()='NOMINEE']")private WebElement nominee;
	@FindBy(xpath = "//a[text()='Add Nominee']")private WebElement addnominee;
	@FindBy(name = "client_id")private WebElement ncid;
	@FindBy(xpath = "//input[@name='name']")private WebElement nname;
	@FindBy(name ="sex")private WebElement gender;
	@FindBy(name = "birth_date")private WebElement dob;
	@FindBy(xpath  = "//input[@name='nid']")private WebElement nid;
	@FindBy(xpath = "//input[@name='relationship']")private WebElement nrelation;
	@FindBy(xpath = "//input[@name='priority']")private WebElement npriority;
	@FindBy(xpath = "//a[.='Delete Nominee']")private WebElement ndelete;
	@FindBy(xpath = "//td[.='xyz']/..//a[.='Client Status']")private WebElement clientStstusLink;
	@FindBy(xpath = "//a[.='Edit Client']")private WebElement editclient;
	@FindBy(xpath = "//input[@value='UPDATE']")private WebElement update;
	@FindBy(xpath = "//a[.='Add Client']")private WebElement addclient;
	@FindBy(xpath = "//td[.='xyz']/..//a[.='Edit']")private WebElement editlink;
	@FindBy(xpath = "//a[.='Add Payment']")private WebElement emptyaddpayment;
	@FindBy(xpath = "//a[.='Delete Client']")private WebElement deleteclient;
	@FindBy(xpath = "//a[.='Add Nominee']")private WebElement addnomineee;
	public WebElement getAddnomineee() {
		return addnomineee;
	}
	public WebElement getDeleteclient() {
		return deleteclient;
	}
	public WebElement getEmptyaddpayment() {
		return emptyaddpayment;
	}
	public WebElement getEditlink() {
		return editlink;
	}
	//@FindBy(xpath = "//a[.='Add Nominee']")private WebElement addnominee;
	public WebElement getAddclient() {
		return addclient;
	}
	public WebElement getUpdate() {
		return update;
	}
	public WebElement getEditclient() {
		return editclient;
	}
	public WebElement getClientStstusLink() {
		return clientStstusLink;
	}
	public WebElement getNdelete() {
		return ndelete;
	}

	@FindBy(xpath = "//a[text()='Edit']")private WebElement edit;
	public WebElement getEdit() {
		return edit;
	}

	@FindBy(xpath = "//input[@name='phone']")private WebElement nnumber;
	public WebElement getNominee() {
		return nominee;
	}
	public WebElement getAddnominee() {
		return addnominee;
	}
	public WebElement getNcid() {
		return ncid;
	}
	public WebElement getNname() {
		return nname;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getDob() {
		return dob;
	}
	public WebElement getNid() {
		return nid;
	}
	public WebElement getNrelation() {
		return nrelation;
	}
	public WebElement getNpriority() {
		return npriority;
	}
	public WebElement getNnumber() {
		return nnumber;
	}
	@FindBy(xpath = "//input[@type='submit']")private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	
	 
}
