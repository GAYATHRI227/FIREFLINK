package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase10 extends BaseDocument{
	
	//client->client status->add nominee->submit ->msg(Client record updated successfully)
	@Test
	public void Test1()
	{
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		Nominee n=new Nominee(driver);
		lp.getClients().click();
		lp.getCstatus().click();
		lp.getEditclient().click();
		lp.getUpdate().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Client record updated successfully"));
		sa.assertEquals(check, true,"Payment is not added");
		
		
		
	}
}
