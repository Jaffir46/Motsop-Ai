package test.Motsop;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUp extends GlobalClass {
	@BeforeMethod
	public void setUp() throws Exception {
		browserChrome();
		Url("http://motsop.com");
		maximizeWindow();
		implicitWait(60);
		WebElement SignUpLink = ByXpath("//span[contains(text(),'Sign up now')]");
		SignUpLink.click();	
	}
	@Test
	private void DetailsSuccess() throws InterruptedException {
		WebElement FirstName = ById("firstName");FirstName.sendKeys("Jaffir");
		WebElement LastName = ById("lastName");LastName.sendKeys("JM");
		WebElement MobileSignUp = ById("mobileNumber");MobileSignUp.sendKeys("8122228390");
		WebElement EmailSignUp = ById("emailId");EmailSignUp.sendKeys("contactjaffir1@gmail.com");
		WebElement org = ById("organization");org.sendKeys("Motsop Ai QA");
		WebElement PasswordSignUp = ById("password");PasswordSignUp.sendKeys("12345@Jaf");
		WebElement ConfirmPasswordSignUp = ById("confirmPassword");ConfirmPasswordSignUp.sendKeys("12345@Jaf");
		Thread.sleep(10000);
		WebElement CreateAccount = ByXpath("//button[contains(text(),'Create Account')]");CreateAccount.click();
		//OTP Page
		WebElement otpContinueBtn = ByXpath("//button[(contains(text(), 'Continue'))]");otpContinueBtn.click();
		//BuninessType Page
		WebElement cfs = ByXpath("(//div[@class=\"multi-select-option \"][1])[1]");cfs.click();
		WebElement TransportAgent = ByXpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div/div/div/form/div[2]/div/div/div[3]");TransportAgent.click();
		WebElement nextBtnBtype = ByXpath("//button[contains(text(),'Next')]");nextBtnBtype.click();
		//Business KYC
		WebElement gst = ById("gstNumber");gst.sendKeys("27AAACH7409R1Z1");
		WebElement verifyKycBtn = ByXpath("//button[contains(text(),'Verify')]");verifyKycBtn.click();
		//KYC details page
		WebElement pan = ById("panNumber");pan.sendKeys("AOAPA1234A");
		WebElement kysDetailContinueBtn = ByXpath("//button[contains(text(),'Continue')]");click(kysDetailContinueBtn);
		
		}
	
}
