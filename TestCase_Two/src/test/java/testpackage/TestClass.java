package testpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestClass {
	@Test()
	public void run() throws IOException {
		// setting the path of the chromedriver
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// starting chromedriver
		WebDriver d=new ChromeDriver();
		// maximising the browser window
		d.manage().window().maximize();
		// applying implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigating to the base url
		d.get("https://demo.dealsdray.com/");
		// locating 'username' textfield and entering username
		d.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		// locating 'password' textfield and entering password
		d.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		// locating and clicking the login button
		d.findElement(By.xpath("//*[@type='submit']")).click();
		// locating and clicking the 'order' option in the menu
		d.findElement(By.xpath("//*[@class='MuiButtonBase-root has-submenu compactNavItem css-46up3a']")).click();
		// locating and clickng the 'orders' option in the sub menu
		d.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button")).click();
		// locating and clicking the 'add bulk orders' button
		d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
		// switching inside the frame
		d.switchTo().frame(0);
		// locating the 'file upload' button and clicking it
		WebElement e=d.findElement(By.xpath("//*[@id=\"mui-7\"]"));
		e.click();
		// selecting the file named 'demo-data.xlsx' to be uploaded
		e.sendKeys("C:\\Users\\User\\Downloads\\demo-data.xlsx");
		// locating and clicking the 'import' button
		d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/button")).click();
		//locating and clicking the 'validate data' button
		d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/button")).click();
		// switching to the alert and clicking the 'ok' button
		Alert a=d.switchTo().alert();
		a.accept();
		// taking screenshot of the final displayed page
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		// specifying target location where screenshot is to be saved
		File trg=new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_Two\\Screenshot\\photo.png");
		// copying the screenshot from source to target location
		FileHandler.copy(src, trg);
	}
}

// THE BUGS IN THE FINAL DISPLAYED PAGE ARE : 
// 1. THE TEXTFIELDS ARE NOT ALIGNED WITH EACH OTHER
// 2. WHILE IMPORTING DATA, SOME DATA IS NOT IMPORTED AS SOME OF THE TEXTFIELDS REMAIN BLANK
// 3. SOME OF THE FIELD NAMES ARE PARTIALLY CUT OR NOT WRITTEN PROPERLY (EXAMPLE Customer Declaration, Physical Defect Present,	Customer Declaration Physical Defect Type ARE SOME OF THE FIELD NAMES)
// 4. TEXT ON BOTH 'PREVIOUS' AND 'NEXT' BUTTONS ARE NOT VISIBLE PROPERLY