/**
 * 
 */
package com.blri.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author janapriya
 *
 */
public class PlaceDropdown {
	WebDriver driver;
	
	Select placedropdown1 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/div[1]/div/span/span[1]/span/span[2]\r\n" + 
			"")));

	public PlaceDropdown(WebDriver driver)
	{
		this.driver=driver;
	}
	public void selectByplacedropdown1()
	{
	placedropdown1.selectByVisibleText("Char Safolla");
	placedropdown1.selectByIndex(2);
}
}
