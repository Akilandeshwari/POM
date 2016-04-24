package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers {
	public CreateLeadPage() {

		if (!verifyTitle("Create Lead | opentaps CRM")) {
			Reporter.reportStep("This is NOT create lead page", "FAIL");
		}

	}
	
	public CreateLeadPage enterCompanyName(String data){
		enterById(prop.getProperty("CreateLead.CompanyName.Id"), data);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String data){
		enterById(prop.getProperty("CreateLead.FirstName.Id"), data);
		return this;
	}
	
	public CreateLeadPage enterLastName(String data){
		enterById(prop.getProperty("CreateLead.LastName.Id"), data);
		return this;
	}
	
	public ViewLeadPage clickCreateLead(){
		clickByName(prop.getProperty("CreateLead.ClickLead.Name"));
		return new ViewLeadPage();
	}
}
