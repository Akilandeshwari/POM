package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_CreateLead extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC02_CreateLead";
		testCaseName 	= "TC02 - CreateLead (POM)";
		testDescription = "Create Lead in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password, String loginName, String CompanyName, String firstName,
			String LastName, String verifyFName) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCRMSFA()
		.clickLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(firstName)
		.enterLastName(LastName)
		.clickCreateLead()
		.verifyFirstName(verifyFName);
		}
}
