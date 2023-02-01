package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.Nominee;

public class TestCase3  extends BaseDocument{
	String ncid="855696585";
	String nname="Rita";
	String gender="female";
	String dob="8/9/1999";
	String nid="852741";
	String nrelationship="sister";
	String npriopity="1st";
	String nnum="8529637412";
	@Test
	public void test3() {
		Nominee n=new Nominee(driver);
		n.getNominee().click();
		n.getAddnominee().click();
		n.getNcid().click();
		n.getNcid().sendKeys(ncid);
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
