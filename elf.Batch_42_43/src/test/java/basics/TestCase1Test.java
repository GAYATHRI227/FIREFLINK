package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;

public class TestCase1Test extends BaseDocument {
	String data="78945965";
	String name="arjun";
	String gender="male";
	String dateofbirth="5/8/1997";
	String mstatus="umarried";
	String number="7894561236";
	String address="#34 jayanagar banglore";
	String policyid="852741";
	String nname="prajna";
	String gender1="female";
	String dob="23/7/1998";
	String  natid="852741";
	String  priority="1st";
	String relation="sister";
	String phone="754123698";
	@Test
	public void Test1() {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		lp.getClients().click();
		lp.getAddclient().click();
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


