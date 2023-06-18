package selniumjava.Java_SeleniumWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

/**
 * Hey Guys!! This is Rajesh from AutomationCrackers.
 * This Class helps you to how to use a Implicit wait.Use this method globally as a one time setup.
 * This method is available for 100% free
 * If you have any queries please write to automationcrackers@gmail.com
 */

public class SeleniumImplicitWait {

	WebDriver driver;
	
	//use this method only once globally 
	//This wait is application until the driver is closed
	public void ImplicitWaitSynchronization(long seconds )
     {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
     }
}
