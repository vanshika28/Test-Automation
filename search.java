package lab2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class search {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Amazon");
		driver.navigate().to("https://www.amazon.in/");
		WebElement element1 =  driver.findElement(By.id("nav-signin-tooltip"));

        element1.click();

        WebElement element2 = driver.findElement(By.name("email"));

        element2.sendKeys("vanshikanonu1999@gmail.com");

        WebElement element3 = driver.findElement(By.id("continue"));

        element3.click();

        //id inserted now its password turn

        WebElement element4 = driver.findElement(By.name("password"));

        element4.sendKeys("Devops28@");

        WebElement element5 = driver.findElement(By.id("signInSubmit"));

        element5.click();
        WebElement element6 = driver.findElement(By.id("twotabsearchtextbox"));
        element6.sendKeys("Bottles");
        WebElement element7 = driver.findElement(By.id("continue"));
        element7.click();
	}
}
