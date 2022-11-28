package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;



public class LoginPage extends TestListeners
{
	public static Logger log =LogManager.getLogger(LoginPage.class.getName());
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CRMLogin(String sheetName) throws Exception
	{
				extentInfo("Login for ", sheetName +" Intiated");
				ScreenShot.takeSnapShot("LoginPage", "Pass");
				CommonMethods.input("Username_XPATH", sheetName, "Username", 1);
				CommonMethods.input("password_XPATH", sheetName, "Password", 1);
				CommonMethods.highLight("loginBtn_XPATH");
				CommonMethods.Click("loginBtn_XPATH");
				extentInfo("Sucessfully Login","");
	}
	
	/******************LOGOUT*************************/



public void commonsuser(String uname, String pwd)  throws Exception
{
	
	 CommonMethods.input("username_XPATH", uname);
	 CommonMethods.input("password_XPATH", pwd);
	 CommonMethods.Click("loginBtn_XPATH");
	
}

	public void Logout() throws Exception
	{
			CommonMethods.highLight("ProfileBtn_XPATH");
			CommonMethods.Click("ProfileBtn_XPATH");
			CommonMethods.highLight("logoutBtn_XPATH");
			CommonMethods.Click("logoutBtn_XPATH");
			log.info("Sucessfully logout..");
	}
	
}
