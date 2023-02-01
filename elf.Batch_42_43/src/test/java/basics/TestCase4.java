package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;

public class TestCase4 extends BaseDocument {
	
	@Test
	public void test4() {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		lp.getPaymeent().click();
		lp.getPedit().click();
		lp.getDelete().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Record deleted successfully"));
		sa.assertEquals(check, true,"Payment is not added");
		
		
		
		
		
		
	}
}
