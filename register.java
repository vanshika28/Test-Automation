import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class register {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Amazon");
		driver.navigate().to("https://www.amazon.in/register");
		WebElement element1 = driver.findElement(By.id("ap_customer_name"));
		element1.sendKeys("Vanshika");
		WebElement elementa = driver.findElement(By.id("ap_phone_number"));
		elementa.sendKeys("9149166687" );
		WebElement element2 = driver.findElement(By.id("ap_email"));
		element2.sendKeys("vanshikanonu1999@gmail.com" );
		WebElement element3 = driver.findElement(By.id("ap_password"));
		element3.sendKeys("9045988629");
		WebElement element5 = driver.findElement(By.id("continue"));
		element5.click();
		}
}

