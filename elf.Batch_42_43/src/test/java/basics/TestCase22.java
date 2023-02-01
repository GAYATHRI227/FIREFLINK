package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;

public class TestCase22 extends BaseDocument {
	String cid="654345";
	String month="july";
	String amount="80000";
	String due="0";
	String fine="2000";
	String confirmmsg="New Payment ADDED";
	@Test
	public void Test22() throws InterruptedException {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		lp.getPaymeent().click();
		lp.getPaymenteditlink().click();
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
