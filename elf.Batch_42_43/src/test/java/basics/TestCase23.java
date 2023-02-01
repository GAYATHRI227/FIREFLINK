package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;

public class TestCase23 extends BaseDocument{
	
	@Test
	public void Test() {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		lp.getPaymeent().click();
		lp.getPaymenteditlink().click();
		lp.getUpdate().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("New Payment ADDED"));
		sa.assertEquals(check, true,"Payment is not added");
	}

}
