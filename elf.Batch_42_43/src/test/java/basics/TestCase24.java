package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;

public class TestCase24  extends BaseDocument{
	
	
	@Test
	public void Test24() {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		lp.getPaymeent().click();
		lp.getPaymenteditlink().click();
		lp.getDeletepayment().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Record deleted successfully"));
		sa.assertEquals(check, true,"Record  is not deleted successfully");
    	
		
		
	}

}
