package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class NewCasePage extends TestListeners {
	
	
		public static Logger log =LogManager.getLogger(LoginPage.class.getName());
		
		public NewCasePage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void NewstatusCasepage(String sheetName) throws Exception
		{
			
			CommonMethods.Click("RequestType_XPATH");
			Thread.sleep(3000);
			CommonMethods.input("RequestSearchBox_XPATH", sheetName, "SearchField", 1);
			
			Thread.sleep(3000);
		//	CommonMethods.Click("EnterArrow_XPATH");
			CommonMethods.clickelementbyjavascript("EnterArrow_XPATH");
			Thread.sleep(5000);
			CommonMethods.Click("selectAccountOwnership_XPATH");
			Thread.sleep(3000);
			CommonMethods.Click("HelpSymbol_XPATH");
			
			CommonMethods.scrollDown(400);
			
     		CommonMethods.Click("clickonRaisedbyRadiobutton_XPATH");
			Thread.sleep(3000);
			CommonMethods.input("RaisedbySearchBox_XPATH", sheetName, "RaisedbySearchfield", 1);
			Thread.sleep(3000);
			CommonMethods.Click("EnterArrow_XPATH");
			Thread.sleep(3000);
			CommonMethods.Click("SelectConsumer_XPATH");
			CommonMethods.selectByText("RaisedBy_XPATH", sheetName, "Raiseby", 1);
			Thread.sleep(3000);
			CommonMethods.selectByText("channel_XPATH", sheetName, "Channel", 1);
			
		    Thread.sleep(3000);
			CommonMethods.Click("SaveAndProceed_XPATH");
			
		}
	
}

