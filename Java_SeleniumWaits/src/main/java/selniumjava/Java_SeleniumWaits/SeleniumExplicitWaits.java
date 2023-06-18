package selniumjava.Java_SeleniumWaits;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hey Guys!! This is Rajesh from AutomationCrackers.
 * This Class helps you to how to use a explicit waits. I have wrote a methods to get the more reliable Output.
 * These methods are available for 100% free
 * If you have any queries please write to automationcrackers@gmail.com
 */
public class SeleniumExplicitWaits {
	WebDriver driver;
	WebDriverWait wait;

	// Dynamic Explicit Waits

	// Explicit Waits - Using StalenessOf

	public boolean WaitForStalenessOf(WebElement element, long waitTimeInSeconds) {
		boolean result = false;

		try {
			for (int i = 0; i <= 10; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
					wait.until(ExpectedConditions.stalenessOf(element));
					result = true;
					System.out.println("Wait Till StalenessOf : Element Loaded successfully");
					break;

				} catch (Exception ex) {
					System.out.println("Retrying times - " + i);
					if (i == 10) {
						System.out.println("WaitForStalenessOf() : " + ex.getMessage());
					}
				}
			}
		} catch (Exception ex) {
			result = false;
			System.out.println("WaitForStalenessOf() : " + ex.getMessage());
		}
		return result;
	}

	// Explicit Waits - Using ElementIsVisible

	public boolean WaitTillElementIsVisible(WebElement element, long waitTimeInSeconds) {
		boolean result = false;

		try {
			for (int i = 0; i <= 10; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
					wait.until(ExpectedConditions.visibilityOf(element));
					result = true;
					System.out.println("Wait Till Element is Visible : Element is visible successfully");
					break;

				} catch (Exception ex) {
					System.out.println("Retrying times - " + i);
					if (i == 10) {
						System.out.println("WaitTillElementIsVisible() : " + ex.getMessage());
					}
				}
			}
		} catch (Exception ex) {
			result = false;
			System.out.println("WaitTillElementIsVisible() : " + ex.getMessage());

		}
		return result;
	}

	// Explicit Waits - Using ElementToBeClickable using WebElement as Input
	// Parameter

	public boolean WaitTillElementToBeClickable(WebElement element, long waitTimeInSeconds) {
		boolean result = false;

		try {
			for (int i = 0; i <= 10; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
					wait.until(ExpectedConditions.elementToBeClickable(element));
					result = true;
					System.out.println("Wait Till Element To Be Clickable : Element is ready to click");
					break;

				} catch (Exception ex) {
					System.out.println("Retrying times - " + i);
					if (i == 10) {
						System.out.println("WaitTillElementToBeClickable() : " + ex.getMessage());
					}
				}
			}
		} catch (Exception ex) {
			result = false;
			System.out.println("WaitTillElementToBeClickable() : " + ex.getMessage());

		}
		return result;
	}

	// Explicit Waits - Using ElementToBeClickable using By Locator as Input
	// Parameter

	public boolean WaitTillElementToBeClickable(By locator, long waitTimeInSeconds) {
		boolean result = false;

		try {
			for (int i = 0; i <= 10; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
					wait.until(ExpectedConditions.elementToBeClickable(locator));
					result = true;
					System.out.println("Wait Till Element To Be Clickable : Element is ready to click");
					break;

				} catch (Exception ex) {
					System.out.println("Retrying times - " + i);
					if (i == 10) {
						System.out.println("WaitTillElementToBeClickable() : " + ex.getMessage());
					}
				}
			}
		} catch (Exception ex) {
			result = false;
			System.out.println("WaitTillElementToBeClickable() : " + ex.getMessage());

		}
		return result;
	}

// Explicit Waits - elementSelectionStateToBe using WebElement as Input

	public boolean verifyelementSelectionStateToBe(WebElement element, boolean input, long waitTimeInSeconds) {
		boolean result = false;

		try {
			for (int i = 0; i <= 10; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
					wait.until(ExpectedConditions.elementSelectionStateToBe(element, input));
					result = true;
					if (input == true) {
						System.out.println("Element Selection State To Be True : Element is selected successfully");
					} else {
						System.out.println("Element Selection State To Be False  : Element is Not selected");
					}

					break;

				} catch (Exception ex) {
					System.out.println("Retrying times - " + i);
					if (i == 10) {
						System.out.println("verifyelementSelectionStateToBe() : " + ex.getMessage());
					}
				}
			}
		} catch (Exception ex) {
			result = false;
			System.out.println("verifyelementSelectionStateToBe() : " + ex.getMessage());

		}
		return result;
	}

	// Explicit Waits - elementSelectionStateToBe using By Locator as Input

	public boolean verifyelementSelectionStateToBe(By locator, boolean input, long waitTimeInSeconds) {
		boolean result = false;

		try {
			for (int i = 0; i <= 10; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
					wait.until(ExpectedConditions.elementSelectionStateToBe(locator, input));
					result = true;
					if (input == true) {
						System.out.println("Element Selection State To Be True : Element is selected successfully");
					} else {
						System.out.println("Element Selection State To Be False  : Element is Not selected");
					}

					break;

				} catch (Exception ex) {
					System.out.println("Retrying times - " + i);
					if (i == 10) {
						System.out.println("verifyelementSelectionStateToBe() : " + ex.getMessage());
					}
				}
			}
		} catch (Exception ex) {
			result = false;
			System.out.println("verifyelementSelectionStateToBe() : " + ex.getMessage());

		}
		return result;
	}

	// Explicit Waits - ElemenToBeSelected using WebElement as Input

	public boolean WaitTillElemenToBeSelected(WebElement element, long waitTimeInSeconds) {
		boolean result = false;

		try {
			for (int i = 0; i <= 10; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
					wait.until(ExpectedConditions.elementToBeSelected(element));
					result = true;

					System.out.println("Element To Be Selected : Element is selected successfully");

					break;

				} catch (Exception ex) {
					System.out.println("Retrying times - " + i);
					if (i == 10) {
						System.out.println("verifyelementSelectionStateToBeTrue() : " + ex.getMessage());
					}
				}
			}
		} catch (Exception ex) {
			result = false;
			System.out.println("verifyelementSelectionStateToBeTrue() : " + ex.getMessage());

		}
		return result;
	}

	// Explicit Waits - ElemenToBeSelected using By Locator as Input

	public boolean WaitTillElemenToBeSelected(By locator, long waitTimeInSeconds) {
		boolean result = false;

		try {
			for (int i = 0; i <= 10; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
					wait.until(ExpectedConditions.elementToBeSelected(locator));
					result = true;
					System.out.println("Wait Till Element To Be Selected : Element is selected successfully");
					break;

				} catch (Exception ex) {
					System.out.println("Retrying times - " + i);
					if (i == 10) {
						System.out.println("WaitTillElementisSelected() : " + ex.getMessage());
					}
				}
			}
		} catch (Exception ex) {
			result = false;
			System.out.println("WaitTillElementisSelected() : " + ex.getMessage());

		}
		return result;
	}

	// Explicit Waits - visibilityOfElement using WebElement as Input

		public boolean WaitTillVisibilityOfElement(WebElement element, long waitTimeInSeconds) {
			boolean result = false;

			try {
				for (int i = 0; i <= 10; i++) {
					try {
						wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
						wait.until(ExpectedConditions.visibilityOf(element));
						result = true;

						System.out.println("Wait Till Element is Visible : Element is Visible successfully");

						break;

					} catch (Exception ex) {
						System.out.println("Retrying times - " + i);
						if (i == 10) {
							System.out.println("WaitTillVisibilityOfElement() : " + ex.getMessage());
						}
					}
				}
			} catch (Exception ex) {
				result = false;
				System.out.println("WaitTillVisibilityOfElement() : " + ex.getMessage());

			}
			return result;
		}

		// Explicit Waits - invisibilityOfElement using WebElement as Input

		public boolean WaitTillInvisibilityOfElement(WebElement element, long waitTimeInSeconds) {
			boolean result = false;

			try {
				for (int i = 0; i <= 10; i++) {
					try {
						wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
						wait.until(ExpectedConditions.invisibilityOf(element));
						result = true;
						System.out.println("Wait Till Element is Invisible : Element is Invisibled successfully");
						break;

					} catch (Exception ex) {
						System.out.println("Retrying times - " + i);
						if (i == 10) {
							System.out.println("WaitTillInvisibilityOfElement() : " + ex.getMessage());
						}
					}
				}
			} catch (Exception ex) {
				result = false;
				System.out.println("WaitTillInvisibilityOfElement() : " + ex.getMessage());

			}
			return result;
		}

}
