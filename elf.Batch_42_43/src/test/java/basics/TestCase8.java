package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase8 extends BaseDocument{
	String nname="harshitha";
	String gender="female";
	String dob="5/4/1998";
	String nid="000255";
	String nrelationship="sis";
	String npriopity="2st";
	String nnum="852741963";
	@Test
	public void Test8() {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		Nominee n=new Nominee(driver);
		lp.getClients().click();
		lp.getCstatus().click();
		n.getAddnominee().click();
		n.getNname().click();
		n.getNname().sendKeys(nname);
		n.getGender().click();
		n.getGender().sendKeys(gender);
		n.getDob().click();
		n.getDob().sendKeys(dob);
		n.getNid().click();
		n.getNid().sendKeys(nid);
		n.getNrelation().click();
		n.getNrelation().sendKeys(nrelationship);
		n.getNpriority().click();
		n.getNpriority().sendKeys(npriopity);
		n.getNnumber().click();
		n.getNnumber().sendKeys(nnum);
		n.getSubmit().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("New Nominee ADDED"));
		sa.assertEquals(check, true,"Payment is not added");
		
	}

}
