/**
 * 
 */
package com.blri.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * @author janapriya
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By username= By.id("userName");
	By password= By.id("password");
	By checkbox=By.xpath("//ins[@class='iCheck-helper']");
	By loginButton=By.xpath("//button[@id='btnLogin']");
	By profile=By.xpath("/html/body/div[3]/ul/li[3]/a/i");
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("jana");
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("12345678");
	}
	public void clickoncheckbox()
	{
		driver.findElement(checkbox).click();
	}
	public void clickonLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	public void clickonprofile()
	{
		driver.findElement(profile).click();
	}
	
}
