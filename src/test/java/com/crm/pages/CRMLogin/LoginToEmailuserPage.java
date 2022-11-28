package com.crm.pages.CRMLogin;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class LoginToEmailuserPage  extends TestListeners

{
	public static Logger log =LogManager.getLogger(LoginPage.class.getName());
	
	public LoginToEmailuserPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	LoginPage loginPage = new LoginPage(driver);
	
	public void emailuserlogin(String sheetName) throws Exception
	
	{
		
		loginPage.commonsuser("assingh","acid_qa");
		CommonMethods.Click("clickoncase_XPATH");
		CommonMethods.Click("Select_Assignedtoteam_XPATH");
		CommonMethods.selectByText("Select_Valuefromdropdown_XPATH", sheetName, "EmailUser",1);
		Thread.sleep(3000);
		CommonMethods.Click("ClickOnArrowButton_XPATH");
		
		
	}
	
	 public void checkcaseISvisible() throws Exception, Exception
     {
		 CommonMethods.clickelementbyjavascript("CasefirstLink_XPATH");
	//	 CommonMethods.Click("CasefirstLink_XPATH");  
		 Thread.sleep(3000);
	 //    Assert.assertEquals("CasefirstLink_XPATH","Expe_XPATH","Case is visible in assigned to view");
	    
	     
	     
	     
		 
     }
	 
	 public void customerTagging()
	 {
		 CommonMethods.Click("clickonCustomerTagging_XPATH");
		 
	 }
	 
	 public void caseis_SendforProcessing(String sheetName) throws Exception
	 {
		 CommonMethods.Click("CustomerType_XPATH");
		 CommonMethods.selectByText("CustomerType_XPATH", sheetName, "Customer Type", 1);
		
	 }

}
