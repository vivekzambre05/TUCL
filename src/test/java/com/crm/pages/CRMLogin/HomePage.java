package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class HomePage extends TestListeners

{
	public static Logger log =LogManager.getLogger(LoginPage.class.getName());
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_case() throws Exception
	{
		CommonMethods.Click("CaseObject_XPATH");
	
		CommonMethods.mouseHover("mouseHowerNew_XPATH");
		
		CommonMethods.mouseClick("ClickOnCase_XPATH");
   }
	
   
}
