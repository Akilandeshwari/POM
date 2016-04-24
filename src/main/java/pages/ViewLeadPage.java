package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers {
	public ViewLeadPage() {

		if (!verifyTitle("View Lead | opentaps CRM")) {
			Reporter.reportStep("This is NOT View lead page", "FAIL");
		}
	}
	
	public ViewLeadPage verifyFirstName(String text){
	verifyTextByXpath(prop.getProperty("ViewLead.VerifyFirstName.Xpath"), text);
	return this;
	}
	
}
