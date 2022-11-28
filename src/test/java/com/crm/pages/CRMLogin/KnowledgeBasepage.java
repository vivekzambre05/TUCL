package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class KnowledgeBasepage extends TestListeners {
	
	
	public static Logger log =LogManager.getLogger(LoginPage.class.getName());
	
	public KnowledgeBasepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
   
	public void createknowledgebase(String sheetName)
	{
		CommonMethods.Click("profileImage_XPATH");
		CommonMethods.input("RoleTeamManager_XPATH", sheetName, "SelectRoleTeamManager", 1);
		
	}
	

}
