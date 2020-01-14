package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String exePath = "F:\\chromedriver.exe";
		System.setProperty("webdriver.gecko.driver", "F:\\selenium_softwares\\geckodriver-v0.25.0-win32\\geckodriver.exe"); 	
		WebDriver driver = new FirefoxDriver();
        //driver.get("http://www.popuptest.com/popuptest2.html");
		driver.get("http://192.168.1.190:9004/blri/login_execute");
		//Dropdownselection.dropdown(driver);
		WebElement Username = driver.findElement(By.id("userName"));
		Username.sendKeys("jana");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345678");
		//password changed
		/*WebElement forgot= driver.findElement(By.linkText("Forgot password"));
		forgot.click();
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("jana");
		WebElement radio1 = driver.findElement(By.id("credential1"));
		radio1.click();
		WebElement Emailbutton = driver.findElement(By.id("reset"));
		Emailbutton.click();
		WebElement Backbutton = driver.findElement(By.className("btn btn-light-grey go-back"));
		Backbutton.click();
		Username.clear();
		password.clear();*/
		
		WebElement Checkbox = driver.findElement(By.className("icheckbox_minimal-grey"));
		Checkbox.click();
		WebElement Loginbutton = driver.findElement(By.id("btnLogin"));
		Loginbutton.click();
		//System.out.println("User Login successful");
		WebElement element = driver.findElement(By.className("profile"));
		element.click();
	    WebElement cattle = driver.findElement(By.xpath("//li[@class='profile']//ul[@class='submenu']//li//a[contains(text(),'Cattle')]"));
		cattle.click();
		//WebElement cattle = driver.findElement(By.className("dynamicCertification_list.action?txnType=2007Cattle population"));
		//cattle.click();
		//WebElement Cattle=	 driver.findElement(arg0)
		/*WebElement submenu = driver.findElement(By.className("submenu"));
		submenu.click();    
		WebElement Farmer = driver.findElement(By.className("Farmer"));
		Farmer.click(); 
		WebElement element2 = driver.findElement(By.className("customer_create_customer_customerName"));
		element2.click();
		WebElement element3 = driver.findElement(By.className("Buyer"));
		element3.click();*/
		
	}

}
