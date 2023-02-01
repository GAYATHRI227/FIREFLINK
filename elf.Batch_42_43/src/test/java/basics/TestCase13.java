package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;

public class TestCase13  extends BaseDocument{
	
	@Test
		public void Test13() {
		//failure
		LifeInsuranceManagementSystem lp =new LifeInsuranceManagementSystem(driver);
		lp.getClients().click();
		lp.getCedit().click();
		lp.getAddpayment().click();
		lp.getUpdate().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Client record updated successfully"));
		sa.assertEquals(check, true,"client record is not updated successfully");
		
			
		}
	}
	
	


