package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeInsuranceManagementSystem {

    public  LifeInsuranceManagementSystem(WebDriver driver) {
    PageFactory.initElements(driver,this);	
}
    @FindBy(xpath = "//a[text()='Edit']")private WebElement cedit;
    @FindBy(xpath = "//td[.='GARUDA']/..//a[.='Client Status']")private WebElement cstatus;
    @FindBy(xpath = "//a[text()='Delete Client']")private WebElement cdelete;
    @FindBy(xpath = "//td[.='GARUDA']/..//a[.='Edit']")private WebElement  ccedit;
    @FindBy(xpath = "//td[.='harshitha']/..//a[.='Edit']c")private WebElement addnedit;
    @FindBy(xpath = "//a[.='Edit Client']")private WebElement editclient;
    @FindBy(xpath = "//input[@value='UPDATE']")private WebElement update;
    @FindBy(xpath = "//a[.='Add Payment']")private WebElement addpayment;
    @FindBy(xpath = "//td[.='1674566437_159773019']/..//a[.='Edit']")private WebElement  paymenteditlink;
    @FindBy(xpath = "//a[.='Delete Payment']")private WebElement Deletepayment;
    public WebElement getDeletepayment() {
		return Deletepayment;
	}
	public WebElement getPaymenteditlink() {
		return paymenteditlink;
	}
	public WebElement getAddpayment() {
		return addpayment;
	}
	public WebElement getUpdate() {
		return update;
	}
	public WebElement getEditclient() {
		return editclient;
	}
	public WebElement getAddnedit() {
		return addnedit;
	}
	public WebElement getCcedit() {
		return ccedit;
	}
	public WebElement getCdelete() {
		return cdelete;
	}
	public WebElement getCstatus() {
		return cstatus;
	}
	public WebElement getCedit() {
		return cedit;
	}
	@FindBy(xpath = "//a[text()='CLIENTS']") private WebElement clients;
    public WebElement getClients() {
		return clients;
	}
	@FindBy(xpath = "//img[contains(@alt,'Mohan Life_Insurance')]/..//button[@class='outline-button-button button']/../..") private WebElement button;
    // @FindBy(name = "username")private WebElement username;
	public WebElement getButton() {
		return button;
	}
	@FindBy(name = "client_id")private WebElement clientid;
	@FindBy(xpath = "//a[text()='Add Client']")private WebElement addclient;
	public WebElement getAddclient() {
		return addclient;
	}
	@FindBy(xpath = "//a[text()='PAYMENTS']")private WebElement paymeent;
	@FindBy(xpath = "//a[text()='Add Payment']") private WebElement addbutton;
	
	@FindBy(xpath = "//a[text()='Edit']")private WebElement pedit;
	@FindBy(xpath = "//a[text()='Delete Payment']") private WebElement delete;
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getPedit() {
		return pedit;
	}
	public WebElement getAddbutton() {
		return addbutton;
	}
	public WebElement getPaymeent() {
		return paymeent;
	}
	public WebElement getClientid() {
		return clientid;
	}
	public WebElement getClientpwsd() {
		return clientpwsd;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getClasselement() {
		return classelement;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getDateofbirth() {
		return dateofbirth;
	}
	public WebElement getMartialstatus() {
		return martialstatus;
	}
	public WebElement getNationalid() {
		return nationalid;
	}
	public WebElement getPhoneElement() {
		return phoneElement;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getPolicy() {
		return policy;
	}
	public WebElement getAgent() {
		return agent;
	}
	public WebElement getNominee() {
		return nominee;
	}
	public WebElement getNomineename() {
		return nomineename;
	}
	public WebElement getGender1() {
		return gender1;
	}
	public WebElement getNominebirthdate() {
		return nominebirthdate;
	}
	public WebElement getNomineeId2() {
		return nomineeId2;
	}
	public WebElement getRelatiship() {
		return relatiship;
	}
	public WebElement getProiority() {
		return proiority;
	}
	public WebElement getNomineephone() {
		return nomineephone;
	}
	
	@FindBy(name = "client_password") private WebElement clientpwsd;
	@FindBy(name = "name") private WebElement name;
	@FindBy(className = "fileToUpload")private WebElement classelement;
	@FindBy(name = "sex") private WebElement gender;
	@FindBy(name = "birth_date") private WebElement dateofbirth;
	@FindBy(name = "maritial_status") private WebElement martialstatus;
	@FindBy(name = "nid") private WebElement  nationalid;
	@FindBy(name = "phone") private  WebElement phoneElement;
	@FindBy(name = "address") private WebElement address;
	@FindBy(name = "policy_id") private WebElement policy;
	@FindBy(name = "agent_id")private WebElement agent;
	@FindBy(name = "nominee_id") private WebElement nominee;
	@FindBy(name = "nominee_name") private WebElement  nomineename;
	//1674478901-1772814978
	@FindBy(name="nominee_sex") private WebElement gender1;
	@FindBy(name = "nominee_birth_date") private WebElement nominebirthdate;
	@FindBy(name = "nominee_nid") private WebElement nomineeId2;
	@FindBy(name = "nominee_relationship") private WebElement relatiship;
	@FindBy(name = "priority") private WebElement proiority;
	@FindBy(name = "nominee_phone") private WebElement nomineephone;
	
	@FindBy(name="img") private WebElement imagee;
	public WebElement getImagee() {
		return imagee;
	}
	@FindBy(xpath = "//input[@type='submit']") private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	//////////////////////////////////////////////////////////////////////
	@FindBy(name = "client_id")private WebElement pcid;
	public WebElement getPcid() {
		return pcid;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getAmount() {
		return amount;
	}
	public WebElement getDue() {
		return due;
	}
	public WebElement getFine() {
		return fine;
	}
	public WebElement getSubmittt() {
		return submittt;
	}

	@FindBy(xpath = "//input[contains(@name,'month') ][1]")private WebElement month;
	@FindBy(xpath = "//input[@name='amount']") private WebElement amount;
	@FindBy(xpath = "//input[@name='due']")private WebElement due;
	@FindBy(xpath = "//input[@name='fine']")private WebElement fine;
	@FindBy(xpath = "//input[@type='submit']") private WebElement submittt;
	
}