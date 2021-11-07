package testpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UnitTest3 {
	//test for taking photo
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("use-fake-device-for-media-stream");
	     options.addArguments("use-fake-ui-for-media-stream");
	     var prefs = new HashMap<String, Object>();
	     prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
	     prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
	     options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String baseUrl = "https://phongstagram.herokuapp.com/";
		driver.get(baseUrl);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/input[1]")).sendKeys("vuhieuphong99@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/input[2]")).sendKeys("yadech99");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		driver.findElement(By.xpath("//i[contains(text(),'add_circle_outline')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Take Photo')]")).click();

		
		driver.findElement(By.xpath("//div[@id='inner-circle']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Upload Photo')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='CameraPhotoModal']/div[2]/a[2]")).click();
		
		//driver.close();
	}
}
