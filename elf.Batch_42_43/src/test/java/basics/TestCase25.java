package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase25  extends BaseDocument{
	
	String cid="654345";
	String month="june";
	String amount="566000";
	String due="0";
	String fine="2080";
	String confirmmsg="New Payment ADDED";
	
	@Test
	public void Test25() throws InterruptedException {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		Nominee n=new Nominee(driver);
		lp.getClients().click();
		lp.getCstatus().click();
		lp.getAddpayment().click();
		lp.getPcid().click();
		lp.getPcid().sendKeys(cid);
		lp.getMonth().click();
		lp.getMonth().sendKeys(month);
		lp.getAmount().click();
		lp.getAmount().sendKeys(amount);
		lp.getDue().click();
		lp.getDue().sendKeys(due);
		lp.getFine().click();
		lp.getFine().sendKeys(fine);
		lp.getSubmittt().click();
		Thread.sleep(5000);
		//sa.assertEquals(false, false);
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("New Payment ADDED"));
		sa.assertEquals(check, true,"Payment is not added");
		
		
		
	
	}

}
