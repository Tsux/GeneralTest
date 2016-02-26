package org.ektqa.webdriver.common;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class WebDriverTestIndividualDexOper extends WebDriverTest{
protected static PrintStream stdout = new PrintStream(new FileOutputStream(FileDescriptor.out));
	
	public WebDriverTestIndividualDexOper() {
		super();
	}

	@BeforeClass
	@Parameters( { "selenium-host", "selenium-port", "browser",
		"dexoper-app-host", "dexoper-user", "dexoper-password"})
	public void setUpProperties(String seleniumHostAddress, int seleniumPort,
			String browser, String appHost, String userName, String password)
			throws Exception {
		super.setUpProperties(seleniumHostAddress, seleniumPort, browser, appHost, userName, password);
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		stdout.println("Quitting webdriver from WebDriverTestIndividual class");
		super.tearDown();
	}
}
