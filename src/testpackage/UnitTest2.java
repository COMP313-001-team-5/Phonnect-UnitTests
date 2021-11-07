package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnitTest2 {
	//test turning off hidden mode chat
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String baseUrl = "https://phongstagram.herokuapp.com/";
		driver.get(baseUrl);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/input[1]")).sendKeys("vuhieuphong99@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/input[2]")).sendKeys("yadech99");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();

		driver.findElement(By.xpath("//i[contains(text(),'forum')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[7]/div[2]/div[1]/a[1]/div[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(text(),'remove_red_eye')]")));
		driver.findElement(By.xpath("//i[contains(text(),'remove_red_eye')]")).click();
		
		//driver.close();
	}
}
