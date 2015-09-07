package basicborland;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Borland {
private WebDriver driver;
	
	
	
	@Test
	public void mainf() throws Exception{
	driver.findElement(By.name("bSubmit")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("QTY_TENTS")).clear();

	driver.findElement(By.name("QTY_TENTS")).sendKeys("4");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("QTY_BACKPACKS")).clear();
	driver.findElement(By.name("QTY_BACKPACKS")).sendKeys("2");

	driver.findElement(By.name("QTY_SOCKS")).clear();
	driver.findElement(By.name("QTY_SOCKS")).sendKeys("3");
	
	}
	
	@Before
	public void openbrowser(){
		driver =new FirefoxDriver();
		driver.navigate().to("http://demo.borland.com/gmopost/");   
		driver.manage().window().maximize();
	}
	
	
	
	
}

