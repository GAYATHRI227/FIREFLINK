package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase15   extends BaseDocument {
	
	
	String data="78945965";
	String name="anushka";
	String gender="female";
	String dateofbirth="5/8/1991";
	String mstatus="umarried";
	String number="7897561836";
	String address="#34 banshankari banglore";
	String policyid="8527541";
	String nname="anusha";
	String gender1="female";
	String dob="23/7/1997";
	String  natid="8527851";
	String  priority="1st";
	String relation="sister";
	String phone="754128598";
	@Test
	public void Test15() {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		Nominee n= new Nominee(driver);
		n.getNominee().click();
		n.getClientStstusLink().click();
		n.getEditclient().click();
		n.getAddclient().click();
		lp.getClientpwsd().click();
		lp.getClientpwsd().sendKeys(data);
		lp.getName().click();
		lp.getName().sendKeys(name);
		//lp.getImagee().click();
		//--------------------------------------
		lp.getGender().click();
		lp.getGender().sendKeys(gender);
		lp.getDateofbirth().click();
		lp.getDateofbirth().sendKeys(dateofbirth);
		lp.getMartialstatus().click();
		lp.getMartialstatus().sendKeys(mstatus);
		lp.getNationalid().click();
		lp.getPhoneElement().click();
		lp.getPhoneElement().sendKeys(number);
		lp.getAddress().click();
		lp.getAddress().sendKeys(address);
		lp.getPolicy().click();
		lp.getPolicy().sendKeys(policyid);
		lp.getNomineename().click();
		lp.getNomineename().sendKeys(nname);
		lp.getGender1().click();
		lp.getGender1().sendKeys(gender1);
		lp.getNominebirthdate().click();
		lp.getNominebirthdate().sendKeys(dob);
		lp.getNationalid().click();
		lp.getNationalid().sendKeys(natid);
		lp.getRelatiship().click();
		lp.getRelatiship().sendKeys(relation);
		lp.getProiority().click();
		lp.getProiority().sendKeys(priority);
		lp.getNomineephone().click();
		lp.getNomineephone().sendKeys(phone);
		lp.getSubmit().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("New Nominee ADDED"));
		sa.assertEquals(check, true,"Payment is not added");
		
		
	}

}
