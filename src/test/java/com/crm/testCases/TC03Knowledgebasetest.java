package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.KnowledgeBasepage;
import com.crm.pages.CRMLogin.LoginPage;

public class TC03Knowledgebasetest extends SetUp
{
	LoginPage loginp;
	KnowledgeBasepage kb;
	@Test
	public void VerifyKnowledgeBase() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "KnowledgeBase";
	
	 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
	  if (!(CommonMethods.isTestRunnable("TC03Knowledgebasetest",sheetName))) {

			throw new SkipException(
					"Skipping the test VerifyCRMLogin as the Run mode is NO");
		}
	  
	  loginp = new LoginPage(driver);
	  loginp.CRMLogin(sheetName);
	  
//	  kb = new KnowledgeBasepage(driver);
//	  kb.createknowledgebase(sheetName);
}
}
