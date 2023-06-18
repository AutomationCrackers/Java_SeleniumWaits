package selniumjava.Java_SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 * Hey Guys!! This is Rajesh from AutomationCrackers. 
 * This Class helps you to how to use a Fluent wait.This method works based on the polling time.
 * This method is available for 100% free 
 * If you have any queries please write to automationcrackers@gmail.com
 */
public class SeleniumFluentWaits {
	
	WebDriver driver;

	// This wait is applicable based on polling time
	public void FluentWaits(long timeoutSecs, long pollingtimeSecs) 
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeoutSecs)).pollingEvery(Duration.ofSeconds(pollingtimeSecs));
				  
	}
}
