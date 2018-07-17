package mission;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectNew {
	@Test
	public void testlogin()
	{
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("raghavendrakuna");
		driver.findElement(By.id("password")).sendKeys("R@lkm815");
		driver.findElement(By.name("commit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"sign in to Github .  Github");
		
		System.out.println("Continue to test............");
	}
}


