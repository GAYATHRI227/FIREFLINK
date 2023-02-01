package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;

public class TestCase5 extends BaseDocument{
	@Test
	public void test5() throws InterruptedException {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		lp.getClients().click();
		Thread.sleep(5000);
		lp.getCcedit().click();
		Thread.sleep(5000);
		lp.getCdelete().click();
		Thread.sleep(5000);
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Client deleted successfully"));
		sa.assertEquals(check, true,"Payment is not added");
		
		
	}

}
