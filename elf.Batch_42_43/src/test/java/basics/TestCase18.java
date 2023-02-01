package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.Nominee;

public class TestCase18 extends BaseDocument{
		 
	
	String nname="xyz";
	String gender="female";
	String dob="8/9/1899";
	String nid="852561";
	String nrelationship="sister";
	String npriopity="2st";
	String nnum="8529655512";
	
	
	@Test
		public  void  Test18() {
		Nominee n=new Nominee(driver);
		n.getNominee().click();
		n.getClientStstusLink().click();
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


