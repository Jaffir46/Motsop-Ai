package test.Motsop;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewClientProfileForm extends GlobalClass{
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		browserChrome();
		Url("http://motsop.com");
		maximizeWindow();
		implicitWait(60);
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "9944215429");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "1234@Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();
		//Client
		WebElement client = ByXpath("//span[contains(text(),'Client')]");client.click();
		WebElement addNewClientBtn = ByXpath("//button[@type=\"button\"]");addNewClientBtn.click();
		
	}
	@Test
	private void MandatoryFieldManualEntrySubmit() throws InterruptedException {
		WebElement cmpyName = ById("FirstName");cmpyName.sendKeys("Mani");
		WebElement gst = ById("gstNumber");gst.sendKeys("27AAACH7409R1Z1");
		WebElement mobile = ByXpath("//input[@type=\"tel\"][1]");mobile.sendKeys("9877778787");
		WebElement mail = ById("emailId");mail.sendKeys("sample@gm.co");
		WebElement address1 = ById("address1");address1.sendKeys("line1");
		WebElement pincode = ById("pincode");pincode.sendKeys("628339");
		WebElement state = ById("state");state.sendKeys("TN");
		WebElement city = ById("city");city.sendKeys("city1");
		WebElement ctry = ById("country");ctry.sendKeys("Ind");
		//cmpType
		WebElement imp = ByXpath("//span[contains(text(),'Importer')]");imp.click();
		WebElement exp = ByXpath("//span[contains(text(),'Exporter')]");exp.click();
		WebElement frw = ByXpath("//span[contains(text(),'Forwarder')]");frw.click();
		WebElement cfs = ByXpath("//span[contains(text(),'CFS/ICD')]");cfs.click();
		WebElement cha = ByXpath("//span[contains(text(),'CHA')]");cha.click();
		WebElement trans = ByXpath("//span[contains(text(),'Transporter')]");trans.click();
		WebElement manf = ByXpath("//span[contains(text(),'Manufacturing')]");manf.click();
		//ExecutiveDetails
		WebElement exFName = ById("executiveDetails[0].firstName");exFName.sendKeys("Name1");
		WebElement exLName = ById("executiveDetails[0].lastName");exLName.sendKeys("LName");
		WebElement exRole = ById("executiveDetails[0].role");exRole.sendKeys("role");
		WebElement exMobile = ByXpath("(//input[@type=\"tel\"][1])[2]");exMobile.sendKeys("8777776876");
		WebElement exMail = ById("executiveDetails[0].emailId");exMail.sendKeys("mail@gm.in");
		//submit
		WebElement clientSubmitBtn = ByXpath("//button[contains(text(),'Submit')]");clientSubmitBtn.click();
		Thread.sleep(5000);
	}
	@Test
	private void MandatoryFieldManualEntryCancel() throws InterruptedException {
		WebElement cmpyName = ById("FirstName");cmpyName.sendKeys("Mani");
		WebElement gst = ById("gstNumber");gst.sendKeys("27AAACH7409R1Z1");
		WebElement mobile = ByXpath("//input[@type=\"tel\"][1]");mobile.sendKeys("9877778787");
		WebElement mail = ById("emailId");mail.sendKeys("sample@gm.co");
		WebElement address1 = ById("address1");address1.sendKeys("line1");
		WebElement pincode = ById("pincode");pincode.sendKeys("628339");
		WebElement state = ById("state");state.sendKeys("TN");
		WebElement city = ById("city");city.sendKeys("city1");
		WebElement ctry = ById("country");ctry.sendKeys("Ind");
		//cmpType
		WebElement imp = ByXpath("//span[contains(text(),'Importer')]");imp.click();
		WebElement exp = ByXpath("//span[contains(text(),'Exporter')]");exp.click();
		WebElement frw = ByXpath("//span[contains(text(),'Forwarder')]");frw.click();
		WebElement cfs = ByXpath("//span[contains(text(),'CFS/ICD')]");cfs.click();
		WebElement cha = ByXpath("//span[contains(text(),'CHA')]");cha.click();
		WebElement trans = ByXpath("//span[contains(text(),'Transporter')]");trans.click();
		WebElement manf = ByXpath("//span[contains(text(),'Manufacturing')]");manf.click();
		//ExecutiveDetails
		WebElement exFName = ById("executiveDetails[0].firstName");exFName.sendKeys("Name1");
		WebElement exLName = ById("executiveDetails[0].lastName");exLName.sendKeys("LName");
		WebElement exRole = ById("executiveDetails[0].role");exRole.sendKeys("role");
		WebElement exMobile = ByXpath("(//input[@type=\"tel\"][1])[2]");exMobile.sendKeys("8777776876");
		WebElement exMail = ById("executiveDetails[0].emailId");exMail.sendKeys("mail@gm.in");
		//Cancel
		WebElement clientSubmitBtn = ByXpath("//button[contains(text(),'Cancel')]");clientSubmitBtn.click();
		Thread.sleep(3000);
	}
	@Test
	private void AllFields() {
		WebElement cmpyName = ById("FirstName");cmpyName.sendKeys("Mani");
		WebElement gst = ById("gstNumber");gst.sendKeys("27AAACH7409R1Z1");
		WebElement mobile = ByXpath("//input[@type=\"tel\"][1]");mobile.sendKeys("9877778787");
		WebElement mail = ById("emailId");mail.sendKeys("sample@gm.co");
		WebElement address1 = ById("address1");address1.sendKeys("line1");
		WebElement pincode = ById("pincode");pincode.sendKeys("628339");
		WebElement state = ById("state");state.sendKeys("TN");
		WebElement city = ById("city");city.sendKeys("city1");
		WebElement ctry = ById("country");ctry.sendKeys("Ind");
		//cmpType
		WebElement imp = ByXpath("//span[contains(text(),'Importer')]");imp.click();
		WebElement exp = ByXpath("//span[contains(text(),'Exporter')]");exp.click();
		WebElement frw = ByXpath("//span[contains(text(),'Forwarder')]");frw.click();
		WebElement cfs = ByXpath("//span[contains(text(),'CFS/ICD')]");cfs.click();
		WebElement cha = ByXpath("//span[contains(text(),'CHA')]");cha.click();
		WebElement trans = ByXpath("//span[contains(text(),'Transporter')]");trans.click();
		WebElement manf = ByXpath("//span[contains(text(),'Manufacturing')]");manf.click();
		//ExecutiveDetails
		WebElement exFName = ById("executiveDetails[0].firstName");exFName.sendKeys("Name1");
		WebElement exLName = ById("executiveDetails[0].lastName");exLName.sendKeys("LName");
		WebElement exRole = ById("executiveDetails[0].role");exRole.sendKeys("role");
		WebElement exMobile = ByXpath("(//input[@type=\"tel\"][1])[2]");exMobile.sendKeys("8777776876");
		WebElement exMail = ById("executiveDetails[0].emailId");exMail.sendKeys("mail@gm.in");
		//BillingDetails
		WebElement billingDetailsTab = ByXpath("//button[contains(text(),'Billing Details')]");click(billingDetailsTab);
		//checkbox(BillingAddress)
        WebElement sameCmpyDetails = ByXpath("//label[contains(text(),'Use Same Company Details')]");click(sameCmpyDetails);
        //checkbox(ShippingAddress)
        WebElement shipAddress = ByXpath("//label[contains(text(),'Use Same Company Details')]");click(shipAddress);
        
        
	}
	
	@AfterMethod
	private void end() {
		quit();
		}
}
