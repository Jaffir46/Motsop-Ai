package test.Motsop;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPassword extends GlobalClass {

	@BeforeMethod
	public void setUp() throws Exception {
		browserChrome();
		Url("http://motsop.com");
		maximizeWindow();
		implicitWait(10);
		WebElement forgotPassword = ByXpath("//button[contains(text(),'Forgot Password?')]");forgotPassword.click();	
		implicitWait(10);
		}
	@Test
	private void ForgotPasswordMobilePossitiveFlow() throws InterruptedException {
		WebElement FpMobile = ByXpath("//input[@name=\"emailId\"]");FpMobile.sendKeys("8122228398");
		Thread.sleep(20000);
		WebElement sendOtpbtn = ByXpath("//button[contains(text(),'Send OTP')]");sendOtpbtn.click();
		Thread.sleep(5000);
		WebElement newPass = ById("newPassword");newPass.sendKeys("1234@Jaf");
		WebElement confirmNewPass = ById("confirmPassword");confirmNewPass.sendKeys("1234@Jaf");
		WebElement resetPasswordBtn = ByXpath("//button[contains(text(),'Reset Password')]");resetPasswordBtn.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		}
	@Test
	private void ForgotPasswordEmailPossitiveFlow() throws InterruptedException {
		WebElement FpMobile = ByXpath("//input[@name=\"emailId\"]");FpMobile.sendKeys("contactjaffir@gmail.com");
		Thread.sleep(20000);
		WebElement sendOtpbtn = ByXpath("//button[contains(text(),'Send OTP')]");sendOtpbtn.click();
		Thread.sleep(5000);
		WebElement newPass = ById("newPassword");newPass.sendKeys("1234@Jaf");
		WebElement confirmNewPass = ById("confirmPassword");confirmNewPass.sendKeys("1234@Jaf");
		WebElement resetPasswordBtn = ByXpath("//button[contains(text(),'Reset Password')]");resetPasswordBtn.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		}
//	@AfterMethod
//	private void end() {
//		quit();}
}