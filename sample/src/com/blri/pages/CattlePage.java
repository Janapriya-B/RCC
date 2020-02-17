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
public class CattlePage {

	/*
	 * @param args
	 */
	
	WebDriver driver;
	
	By cattle=By.xpath("/html/body/div[3]/ul/li[3]/ul/li[5]/a");
	By addcattle=By.xpath("//*[@id=\"add\"]");
	By tagnumber=By.xpath("//*[@id=\"farmerCode\"]");
	By cattlename=By.xpath("//*[@id=\"cowName\"]");
	By SireTagNumber=By.xpath("//*[@id=\"proofNo\"]");
	By DamTagNumber=By.xpath("//*[@id=\"mobileNumber\"]");
	
	public CattlePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickoncattle()
	{
		driver.findElement(cattle).click();
	}
	public void clickonaddcattle()
	{
		driver.findElement(addcattle).click();
	}
	public void typetagnumber()
	{
		driver.findElement(tagnumber).sendKeys("GVG0987");
	}
	public void typecattlename()
	{
		driver.findElement(cattlename).sendKeys("AT Cattle");
	}
	public void typesireTagNumber()
	{
		driver.findElement(SireTagNumber).sendKeys("STG7676");
	}
	public void typedamTagNumber()
	{
		driver.findElement(DamTagNumber).sendKeys("DST8776");
	}

}
