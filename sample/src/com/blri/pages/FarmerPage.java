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
public class FarmerPage {

	/**
	 * @param args
	 */
	WebDriver driver;
	By farmer=By.xpath("/html/body/div[3]/ul/li[3]/ul/li[4]/a");
	By farmerview=By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[3]/div/table/tbody/tr[3]/td[3]");
	By farmerback=By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/div/div/div/div[1]/div/div[2]/div/span[3]/span/button/b/font");
	By addfarmer=By.xpath("//*[@id=\"add\"]");
	By farmercode=By.xpath("//*[@id=\"target_farmerInfo_farmerCode\"]");
	/*By savebutton=By.xpath("/html/body/div[2]/div[1]/div[2]/form/div[2]/div[3]/div/button[1]/div/font/b");
	By farmername=By.xpath("//*[@id=\"farmerName\"]");
	//By fathername=By.xpath("//*[@id=\"fatherName\"]");
	//By placedropdown1 = By.xpath("//*[@id=\"select2-samithii-container\"]");

   // 
	/*
	
	By mobilenumber=By.xpath("//*[@id=\"mobileNumber\"]");
	By cattlenumber=By.xpath("//*[@id=\"noOfCattle\"]");
    By landowned=By.xpath("//*[@id=\"landOwned\"]");
    By nationalid=By.xpath("//*[@id=\"nationalId\"]");
    By explivestck=By.xpath("//*[@id=\"experienceLiveStock\"]");
    By familymember=By.xpath("//*[@id=\"totalFamilyMember\"]");
    By familyincome=By.xpath("//*[@id=\"totalFamilyIncome\"]");*/
	
	public FarmerPage(WebDriver driver)
	{
		this.driver=driver;
	}
    
	public void clickonfarmer()
	{
		driver.findElement(farmer).click();
	}
	public void clickonfarmerview()
	{
		driver.findElement(farmerview).click();
	}
	public void clickonfarmerback()
	{
		driver.findElement(farmerback).click();
	}
	public void clickonaddfarmer()
	{
		driver.findElement(addfarmer).click();
	}
	/*public void typefarmercode()
	{
		driver.findElement(farmercode).sendKeys("FV6532");
	}
	/*public void clickonsavebutton()
	{
		driver.findElement(savebutton).click();
	}
	public void typeFarmername()
	{
		driver.findElement(farmername).sendKeys("Pinky");
	}
	/*public void typeFathername()
	{
		driver.findElement(fathername).sendKeys("Durai");
	}
	/*public void selectbyplacedropdown1()
	{

		driver.findElement(placedropdown1).click();
	}
	
	
	public void typeMobileNumber()
	{
		driver.findElement(mobilenumber).sendKeys("9855478589");
	}
	public void typeCattleNumber()
	{
		driver.findElement(cattlenumber).sendKeys("25");
	}
	public void typelandowned()
	{
		driver.findElement(landowned).sendKeys("12");
	}
	public void typenationalid()
	{
		driver.findElement(nationalid).sendKeys("8441452563365");
	}
	public void typeexplivestck()
	{
		driver.findElement(explivestck).sendKeys("12");
	}
	public void typefamilymember()
	{
		driver.findElement(familymember).sendKeys("6");
	}
	public void typefamilyincome()
	{
		driver.findElement(familyincome).sendKeys("52145200");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
