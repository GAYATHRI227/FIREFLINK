package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.Nominee;

public class TestCase14 extends BaseDocument{
	@Test 
	public void Test4() {
		Nominee n= new Nominee(driver);
		n.getNominee().click();
		n.getClientStstusLink().click();
		n.getEditclient().click();
		n.getUpdate().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Client record updated successfully"));
		sa.assertEquals(check, true,"client record is not updated successfully");
		
			
	}

}
