package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase11 extends BaseDocument{
	
	
	//clients->client Status ->edit client->delete client(nominee delete)
	@Test
	public void Test12() {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		Nominee n=new Nominee(driver);
		lp.getClients().click();
		lp.getCstatus().click();
		lp.getCedit().click();
		//scroll
		//lp.getCdelete().click();
		n.getNdelete().click();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Client deleted successfully"));
		sa.assertEquals(check, true,"client is not deleted sucessfully");
	}

}
