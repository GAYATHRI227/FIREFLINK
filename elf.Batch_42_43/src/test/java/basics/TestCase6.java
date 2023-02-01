package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;

public class TestCase6  extends BaseDocument{
	@Test 
	public  void  test6() {
		
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		lp.getClients().click();
		lp.getCstatus().click();
		lp.getCdelete().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Client deleted successfully"));
		sa.assertEquals(check, true,"Payment is not added");
		
	}

	

}
