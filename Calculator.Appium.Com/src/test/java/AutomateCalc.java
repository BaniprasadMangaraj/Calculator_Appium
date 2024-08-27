import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AutomateCalc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	
	{
		
		//Gather Desired Capabilites
				DesiredCapabilities capabilities = new DesiredCapabilities();
				
				capabilities.setCapability("deviceName", "OnePlus");
				capabilities.setCapability("platformVersion", "14");
				capabilities.setCapability("automationName", "UiAutomator2");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("deviceName", "OnePlus");
				capabilities.setCapability("appPackage","com.oneplus.calculator");
				capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
				
				
				URL url = URI.create("http://127.0.0.1:4723/").toURL();
				
				AndroidDriver driver = new AndroidDriver(url, capabilities);//Create a Object For Android Driver And Pass the 2 parameters
				
				Thread.sleep(5000);
				System.out.println("Application Started Sucessfully");
				
				//Some Addition Automation in Calculator
				//Click On Number 8
			    WebElement number8	= driver.findElement(By.id("com.oneplus.calculator:id/digit_8"));
			    number8.click();
			    
			    //Click Addition
			    WebElement add	= driver.findElement(By.id("com.oneplus.calculator:id/img_op_add"));
			    add.click();
			    
			    //Click On Number 3
			    WebElement number3	= driver.findElement(By.id("com.oneplus.calculator:id/digit_3"));
			    number3.click();
			    
			    //Click on Equal Sign
			    WebElement equal	= driver.findElement(By.id("com.oneplus.calculator:id/img_eq"));
			    equal.click();
			    
			    //Result Capture
			    WebElement result	= driver.findElement(By.id("com.oneplus.calculator:id/result"));
			    
			    String resultString = result.getText();	//Capture The result from result Box
			    
			    if(resultString.equals("11"))
			    	
			    {
			    	System.out.println("Pass");
			    }
			    else
			    {
			    	System.out.println("Fail");
			    }
				
				
				
				
				
			driver.quit();//Close Session

	}

}
