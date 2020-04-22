package automationf;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


//import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	public static WebDriver driver;
	
	@DataProvider(name="TestData")
	  public Object[][] getData() throws InterruptedException{
		return new Object[][] {
            {"9149166687","Devops28@"}};
	    }
	
	 @Test(priority=1)
	 public void f() throws InterruptedException  {
	 	 
	 	 WebElement element = driver.findElement(By.name("q"));
	 	 element.sendKeys("Indigo");

	 	 driver.navigate().to("https://www.goindigo.in/"); 
	 	  WebElement e1= driver.findElement(By.xpath("//*[@id=\"body\"]/section/div[2]/div[1]/div/div/div/div[1]/div/a[1]"));
	 	  AssertJUnit.assertTrue(e1.isDisplayed());
	 	  System.out.println(" BOOK FLIGHT");
	 	  WebElement e2 = driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[2]/div[2]/label/label"));
	 	  e2.click();
	 	   //trying to locate the source and destination with the below code  
	 	  WebElement e3=  driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/input"));
	 	  e3.click();  
	 	 e3.sendKeys("DED"); 
	 	 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/div/div/div[2]")).click();
	 	 WebElement e4 = driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/input"));
	 	 e4.click();
	 	 e4.sendKeys("AUH"); 
	 	driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/div/div/div[2]")).click();
	 	
	   }
	 @Test(priority=2 , dataProvider="TestData")
		public void login(String username , String password) throws InterruptedException {
			
			//login Credentials
			 WebElement element9 = driver.findElement(By.xpath("/html/body/div[5]/section/div[1]/nav/div/div[3]/ul/li[10]/a"));
			 element9.click();
			 //phone number
			 WebElement element1 = driver.findElement(By.id("memberId"));
			 element1.sendKeys(username);
			 //password
			 WebElement element2 = driver.findElement(By.name("memberLogin.Password"));
			 element2.sendKeys(password);
			 WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mem-login-form\"]/div[4]/div/div[1]/button/span[1]"));
			 element3.click();
	
		
	 }

	 @Test(priority=3)
	 public void options() {
		WebElement e7= driver.findElement(By.linkText("Check-in"));
		 Assert.assertTrue(e7.isDisplayed());
		 System.out.println("CHECK-IN -PRESENT");
		WebElement e8= driver.findElement(By.linkText("Flight Status"));
		Assert.assertTrue(e8.isDisplayed());
		System.out.println("FLIGHT STATUS -PRESENT");
		WebElement e9= driver.findElement(By.linkText("Edit Booking"));
		Assert.assertTrue(e9.isDisplayed());
		System.out.println("EDIT BOOKING -PRESENT");
		WebElement e10= driver.findElement(By.cssSelector("input#igHpSearch"));
		Assert.assertTrue(e10.isDisplayed());
		System.out.println("SEARCH FAQS -PRESENT");
		WebElement e11= driver.findElement(By.cssSelector("[alt='indigo-logo']"));
		Assert.assertTrue(e11.isDisplayed());
		System.out.println("INDIGO LOGO -PRESENT");
		
	 }
	  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.navigate().to("http://www.google.com/");
			driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}