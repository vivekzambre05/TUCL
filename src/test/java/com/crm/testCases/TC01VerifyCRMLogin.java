package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.AssignedtoTeamPage;
import com.crm.pages.CRMLogin.HomePage;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.LoginToEmailuserPage;
import com.crm.pages.CRMLogin.NewCasePage;
import com.crm.base.SetUp;



public class TC01VerifyCRMLogin extends SetUp
{
	public LoginPage login;
	public HomePage home;
    public AssignedtoTeamPage assign;
    public NewCasePage newstatus;
	public LoginToEmailuserPage emailuser;
	@Test
	public void VerifyCRMLogin() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "VerifyCRMLogin";
	
	 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
	  if (!(CommonMethods.isTestRunnable("VerifyCRMLogin",sheetName))) {

			throw new SkipException(
					"Skipping the test VerifyCRMLogin as the Run mode is NO");
		}
	   		 //login to CRM
				login = new LoginPage(driver);
				login.CRMLogin(sheetName);
		 	 Thread.sleep(3000);
				
				home = new HomePage(driver);
				home.click_case();
			// new edit page of an case class
				newstatus = new NewCasePage(driver);
			    newstatus.NewstatusCasepage(sheetName);
				
			 // Save the case into an Assign to Team status	
				assign = new AssignedtoTeamPage(driver);
				assign.saveCaseInAssigned_To_TeamStatus(sheetName);
				
				driver.navigate().refresh();
				Thread.sleep(2000);
				
				login.Logout();
				
		      //login to email user
				 emailuser = new LoginToEmailuserPage(driver);
				 Thread.sleep(2000);
				 emailuser.emailuserlogin(sheetName);
				 
	  
	  
	}
}
