import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
public class WebDriveTest {


	
	
	public String driveTest(){
		System.out.println("das/das");
		System.setProperty("webdriver.gecko.driver", "/Users/Tom/downloads/geckodriver/");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/?gws_rd=ssl");
		WebElement cheese = driver.findElement(By.id("lst-ib"));
		CharSequence[] item = {"abc","defxZssadasdasda"};
		
		cheese.sendKeys(item);
		WebElement cheeser = driver.findElement(By.id("_fZl"));
		cheeser.click();
		WebElement myDynamicElement = (WebElement) (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='rso']/div/div/div[1]/div/div/h3/a")));
		WebElement Supercheese = myDynamicElement.findElement(By.xpath("//*[@id='rso']/div/div/div[1]/div/div/h3/a"));
		return(Supercheese.getText());
	
	}
	
}
