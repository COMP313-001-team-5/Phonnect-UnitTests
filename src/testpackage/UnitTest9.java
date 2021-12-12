package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTest9 {
	//test viewing location suggestions
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String baseUrl = "https://phongstagram.herokuapp.com/";
		driver.get(baseUrl);
		

		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[1]/input[1]")).sendKeys("vuhieuphong99@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[1]/input[2]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[1]/input[2]")).sendKeys("yadech99");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		driver.findElement(By.xpath("//i[contains(text(),'add_circle_outline')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[5]/div[1]/div[1]/div[1]")).click();
		Actions action = new Actions(driver);
		action.sendKeys(String.valueOf("Centennial College")).perform(); 
		
	}
}
