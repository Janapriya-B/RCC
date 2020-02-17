/**
 * 
 */package com.blri.Testcases;

import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.blri.pages.CattlePage;
import com.blri.pages.FarmerPage;
//import com.blri.dropdowns.PlaceDropdown;
import com.blri.pages.LoginPage;

/**
 * @author janapriya
 *
 */
public class VerifyBlriLogin {
	
	
	@Test
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "F:\\selenium_softwares\\geckodriver-v0.25.0-win32\\geckodriver.exe"); 	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.1.190:9004/blri/login_execute");
	LoginPage login= new LoginPage(driver);
	FarmerPage farmer=new FarmerPage(driver);
	//CattlePage cattle=new CattlePage(driver);

	login.typeUserName();
	
	login.typePassword();
	
	login.clickoncheckbox();
	
	login.clickonLoginButton();
	
	login.clickonprofile();
	
	farmer.clickonfarmer();
	
	Thread.sleep(3000);
	
	farmer.clickonfarmerview();
	
	Thread.sleep(3000);
	
	farmer.clickonfarmerback();
	
	farmer.clickonaddfarmer();
	
	/*cattle.clickoncattle();
	
	cattle.clickonaddcattle();
	
	cattle.typetagnumber();
	
	cattle.typecattlename();
	
	cattle.typesireTagNumber();
	
	cattle.typedamTagNumber();
	
	//farmer.typefarmercode();
	
	/*login.clickonsavebutton();
	
	login.typeFarmername();
	
	//login.typeFathername();
	
	//login.clickonsavebutton();

	/*login.typelandowned();
	
	login.typenationalid();
	
	login.typeexplivestck();
	
	login.typefamilymember();
	
	login.typefamilyincome();
	
	//PlaceDropdown dd=new PlaceDropdown(driver);
	
	//dd.selectByplacedropdown1();
	
	/*
	
	
	
	login.typeMobileNumber();
	
	login.typeMobileNumber();
	
	PlaceDropdown dropdown1=new PlaceDropdown(driver);

	dropdown1.selectByplacedropdown1();
	
	//login.clickonplacedropdown();
	//driver.quit();*/
	}
	
}
