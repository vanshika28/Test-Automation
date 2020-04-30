package asser;
import static org.testng.Assert.assertTrue;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class asser1
{
public static void main (String[] args) throws InterruptedException {
    final String s = System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    //Webdriver = interface ChromeDriver= some method(function)"
    driver.navigate().to("https://www.amazon.in/");
    
   WebElement article = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		   article.click();
		   article.sendKeys("Computer");
		   WebElement article1 = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		   article1.click();
		   WebElement article2 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		   article2.click();
		   String str = article2.getText();
		   System.out.println(str);
		   Thread.sleep(10000);
		   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(tabs2.get(1));
 		   WebElement price1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[5]/div[3]/div[9]/div/div/table/tbody/tr[2]/td[1]"));
		   String price= price1.getText();
		   Assert.assertTrue(price.contains("Price"));
		   System.out.println(price);}}