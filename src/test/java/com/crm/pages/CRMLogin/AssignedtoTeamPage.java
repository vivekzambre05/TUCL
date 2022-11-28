package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class AssignedtoTeamPage  extends TestListeners {
	
	
	public static Logger log =LogManager.getLogger(LoginPage.class.getName());
	
	public AssignedtoTeamPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void saveCaseInAssigned_To_TeamStatus(String sheetName) throws Exception
	{
	
		CommonMethods.Click("Edit_XPATH");
		CommonMethods.Click("ClickEdit_XPATH");
		CommonMethods.Click("Select_AssignedTo_Team_XPATH");
		Thread.sleep(3000);
	//	Select value as a email team from assigned to team dropdown.
		CommonMethods.mouseHover("Select_Valuefrom_AssignedtoTeam_XPATH");
		Thread.sleep(3000);
	//	CommonMethods.selectByText("Select_Valuefrom_AssignedtoTeam_XPATH",sheetName, "Assigned to Team", 1);
	//	CommonMethods.selectByValue("Select_Valuefrom_AssignedtoTeam_XPATH", sheetName, "Assigned to Team",1);
		CommonMethods.Click("Value_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("SaveAndProceed_XPATH");
		
	}
	
	
}
