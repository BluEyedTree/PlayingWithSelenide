import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.open;

public class Sele {
  @Test
  public void userCanSearch() {
	  System.setProperty("webdriver.chrome.driver",
		           "/Users/Tom/Documents/workspace/WebDrive/repo/PlayingWithSelenide/Resources/chromedriver");
	  System.setProperty("selenide.browser", "chrome");
	  open("http://www.msn.com");
	    $(By.id("q")).val("Test100Tommy00Test00OK").pressEnter();
  }
  
}