package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
//client->clientstatus->addpayment
public class TestCase7 extends BaseDocument{
	String month="august";
	String amount="820752";
	String due="0";
	String fine="7000";
	String confirmmsg="New Payment ADDED";
	@Test
	public void Test() throws InterruptedException {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		lp.getClients().click();
		lp.getCstatus().click();
		lp.getAddbutton().click();
		lp.getMonth().sendKeys(month);
		lp.getAmount().click();
		lp.getAmount().sendKeys(amount);
		lp.getDue().click();
		lp.getDue().sendKeys(due);
		lp.getFine().click();
		lp.getFine().sendKeys(fine);
		lp.getSubmittt().click();
		Thread.sleep(5000);
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("New Payment ADDED"));
		sa.assertEquals(check, true,"Payment is not added");
		
	}

}
