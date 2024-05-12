package alertsample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert01 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\RAKHI\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.name("cusid")).sendKeys("53920");
driver.findElement(By.name("submit")).submit();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		//now we want to click on OK button in that alert window
	}

}
