package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers {
	
	public CRMHomePage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT  CRM home page", "FAIL");
		}

	}
	
	public CreateLeadPage clickLead(){
		clickByLink(prop.getProperty("CRMHome.CreateLead.Link"));
		return new CreateLeadPage();
	}
	
	

	
}
