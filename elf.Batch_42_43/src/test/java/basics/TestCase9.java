package basics;

import org.testng.annotations.Test;

import GenericLibraries.BaseDocument;
import pomRepository.LifeInsuranceManagementSystem;
import pomRepository.Nominee;

public class TestCase9 extends BaseDocument {
	//client->client status->(add nominiee)edit->add nominee button->delete nominee
	@Test
	public void Test9() throws InterruptedException {
		LifeInsuranceManagementSystem lp=new LifeInsuranceManagementSystem(driver);
		Nominee n=new Nominee(driver);
		lp.getClients().click();
		lp.getCstatus().click();
		Thread.sleep(3000);
		n.getAddnomineee().click();
		//scroll
		Thread.sleep(3000);
		//n.getAddnominee().click();
		n.getNdelete().click();
		
		
		
		//failure
	}

}
