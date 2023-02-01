package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase21 extends BaseDocument {
	
	
    @Test
    public void Test21() {
    	
    	LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		Nominee n=new Nominee(driver);
		n.getNominee().click();
		n.getClientStstusLink().click();
		n.getDeleteclient().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Record deleted successfully"));
		sa.assertEquals(check, true,"Record  is not deleted successfully");
    	
    	
    }

}
