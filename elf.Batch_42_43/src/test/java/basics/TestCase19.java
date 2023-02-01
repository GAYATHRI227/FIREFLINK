package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase19  extends BaseDocument{

	//waiting
	@Test
	public void  Test19() {
		Nominee n=new Nominee(driver);
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		n.getNominee().click();
		n.getClientStstusLink().click();
		n.getAddnominee().click();
		n.getEditlink().click();
		n.getNdelete().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Record deleted successfully"));
		sa.assertEquals(check, true,"Record deleted is not successfully");
		
	
		
		
		
		
	
}
}