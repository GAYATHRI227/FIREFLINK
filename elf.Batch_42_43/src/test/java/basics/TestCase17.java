package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.Nominee;

public class TestCase17  extends  BaseDocument{
	
	@Test
	public  void Test17() {
		Nominee n= new Nominee(driver);
		n.getNominee().click();
		n.getClientStstusLink().click();
		n.getEditclient().click();
		n.getGender().clear();
		String s=driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[text()]")).getText().trim();
		boolean check=(s.contains("Nominees deleted successfully"));
		sa.assertEquals(check, true,"Nominees are not  deleted successfully");
		
	}

}
