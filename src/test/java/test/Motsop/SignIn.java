package test.Motsop;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
public class SignIn extends GlobalClass{

//	@BeforeMethod
//	public void setUp() throws Exception {
//		browserChrome();
//		Url("http://motsop.com");
//		maximizeWindow();
//		implicitWait(10);
//	}
	 @BeforeMethod 
	public void setup(@Optional("chrome") String browser) {
	        if (browser.equalsIgnoreCase("firefox")) { browserFirefox();
	        } else { browserChrome();
	        }
	        Url("http://motsop.com");
			maximizeWindow();
			implicitWait(10);
	    }
	@Test
	private void validMobileValidPassword() throws InterruptedException {
		WebElement mail = (ByXpath("//input[@id=\"emailId\"]"));SendKeys(mail, "8122228398");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "1234@Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
	@Test
	private void InvalidMobileValidPassword1() throws InterruptedException {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "81222283980");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "1234@Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void InvalidMobileValidPassword2() throws InterruptedException {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "812222839");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "1234@Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void InvalidMobileValidPassword3() throws InterruptedException   {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "5122228398");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "1234@Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void InvalidMobileInvalidPassword() throws InterruptedException {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "812222839");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "12345@Ja");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void ValidMailValidPassword() throws InterruptedException {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "contactjaffir@gmail.com");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "1234@Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void InvalidMailValidPassword() throws InterruptedException {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "contactjaffir@gl.co.in");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "1234@Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void ValidMailInvalidPassword() throws InterruptedException {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "contactjaffir@gmail.com");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "12345Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void InvalidMailInvalidPassword() throws InterruptedException {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "contactjaffir@gl.co.in");
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "12345Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void EmptyUserValidPassword() throws InterruptedException {
		WebElement pass = ByXpath("//input[@id=\"password\"]");SendKeys(pass, "1234@Jaf");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
	}
	@Test
	private void ValidMailEmptyPassword() throws InterruptedException {
		WebElement mail = ByXpath("//input[@id=\"emailId\"]");SendKeys(mail, "contactjaffir@gmail.com");
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);

	}
	@Test
	private void EmptyUserEmptyPassword() throws InterruptedException {
		WebElement signIn = findElementByXpath("//button [@type=\"submit\"]");signIn.click();Thread.sleep(3000);
		
		WebElement EmailMobileRequired = findElementByXpath("//p[contains(text(), 'Email or Mobile number is required')]");
		Assert.assertTrue(EmailMobileRequired.isDisplayed());
        Assert.assertEquals(EmailMobileRequired.getText(), "Email or Mobile number is required");
	}
	@AfterMethod
	public void end() {
		quit();
	}
	
}
