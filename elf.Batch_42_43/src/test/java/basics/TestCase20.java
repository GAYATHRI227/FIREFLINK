package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase20 extends BaseDocument{
	
	String month="jan";
	String amount="5222000";
	String due="0";
	String fine="8000";
	String confirmmsg="New Payment ADDED";
	@Test
	public void Test20() throws InterruptedException {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		Nominee n=new Nominee(driver);
		n.getNominee().click();
		n.getClientStstusLink().click();
		//lp.getAddpayment().click();
		n.getEmptyaddpayment().click();
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
