package testPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FireFoxBrowser {
	WebDriver d;
	@Test
	public void run() throws IOException {
	//setting the path of the webDriver
	System.setProperty("webDriver.gecko.driver","C:\\Users\\User\\Desktop\\Selenium\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	// starting webdriver
	d=new FirefoxDriver();
	// maximising the browser window
	d.manage().window().maximize();
	// applying implicit wait
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// navigating to base url
	d.get("https://www.getcalley.com/page-sitemap.xml");
	
//-------------------------------------------------------------------------------
// setting the browser window dimension to be '1920x1080'	
	
	Dimension d1=new Dimension(1920,1080);
	d.manage().window().setSize(d1);	
	
	// locating and clicking the link of the 1st page from the displayed list of pages
	   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
	// taking screenshot of the opened page
	   TakesScreenshot ts1= (TakesScreenshot)d;
	   File src1 = ts1.getScreenshotAs(OutputType.FILE);
	// specifying the target location where the screenshot is to be saved   
	   File trg1 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1920x1080\\Screenshot-9thMay-05.31pm.png");
	// copying the screenshot from source location to target location
	   FileHandler.copy(src1, trg1);
	// navigating back to the displayed list of pages
	   d.navigate().back();
	   
	// locating and clicking the link of the 2nd page from the displayed list of pages
	   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a")).click();
	// taking screenshot of the opened page
	   TakesScreenshot ts2= (TakesScreenshot)d;
	   File src2 = ts2.getScreenshotAs(OutputType.FILE);
	// specifying the target location where the screenshot is to be saved   
	   File trg2 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1920x1080\\Screenshot-9thMay-05.32pm.png");
	// copying the screenshot from source location to target location
	   FileHandler.copy(src2, trg2);
	// navigating back to the displayed list of pages
	   d.navigate().back();
	 
	// locating and clicking the link of the 3rd page from the displayed list of pages
	   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a")).click();
	// taking screenshot of the opened page
	   TakesScreenshot ts3= (TakesScreenshot)d;
	   File src3 = ts3.getScreenshotAs(OutputType.FILE);
	// specifying the target location where the screenshot is to be saved   
	   File trg3 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1920x1080\\Screenshot-9thMay-05.33pm.png");
	// copying the screenshot from source location to target location
	   FileHandler.copy(src3, trg3);
	// navigating back to the displayed list of pages
	   d.navigate().back();   
	
	// locating and clicking the link of the 4th page from the displayed list of pages
	   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();
	// taking screenshot of the opened page
	   TakesScreenshot ts4= (TakesScreenshot)d;
	   File src4 = ts4.getScreenshotAs(OutputType.FILE);
	// specifying the target location where the screenshot is to be saved   
	   File trg4 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1920x1080\\Screenshot-9thMay-05.34pm.png");
	// copying the screenshot from source location to target location
	   FileHandler.copy(src4, trg4);
	// navigating back to the displayed list of pages
	   d.navigate().back();
	   
	// locating and clicking the link of the 5th page from the displayed list of pages
	   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a")).click();
	// taking screenshot of the opened page
	   TakesScreenshot ts5= (TakesScreenshot)d;
	   File src5 = ts5.getScreenshotAs(OutputType.FILE);
	// specifying the target location where the screenshot is to be saved   
	   File trg5 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1920x1080\\Screenshot-9thMay-05.35pm.png");
	// copying the screenshot from source location to target location
	   FileHandler.copy(src5, trg5);
	// navigating back to the displayed list of pages
	   d.navigate().back();   
	   
	// closing the window
	   d.close();
//-------------------------------------------------------------------------------   
	   System.setProperty("webDriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// starting webdriver
		d=new ChromeDriver();
		// maximising the browser window
		d.manage().window().maximize();
		// applying implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigating to base url
		d.get("https://www.getcalley.com/page-sitemap.xml");

// setting the browser window dimension to be '1366×768'
		
	   Dimension d2=new Dimension(1366,768);
		d.manage().window().setSize(d2);
		
		// locating and clicking the link of the 1st page from the displayed list of pages
		   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
		// taking screenshot of the opened page
		   TakesScreenshot ts6= (TakesScreenshot)d;
		   File src6 = ts6.getScreenshotAs(OutputType.FILE);
		// specifying the target location where the screenshot is to be saved   
		   File trg6 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1366×768\\Screenshot-9thMay-05.39pm.png");
		// copying the screenshot from source location to target location
		   FileHandler.copy(src6, trg6);
		// navigating back to the displayed list of pages
		   d.navigate().back();
		   
		// locating and clicking the link of the 2nd page from the displayed list of pages
		   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a")).click();
		// taking screenshot of the opened page
		   TakesScreenshot ts7= (TakesScreenshot)d;
		   File src7 = ts7.getScreenshotAs(OutputType.FILE);
		// specifying the target location where the screenshot is to be saved   
		   File trg7 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1366×768\\Screenshot-9thMay-05.40pm.png");
		// copying the screenshot from source location to target location
		   FileHandler.copy(src7, trg7);
		// navigating back to the displayed list of pages
		   d.navigate().back();
		 
		// locating and clicking the link of the 3rd page from the displayed list of pages
		   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a")).click();
		// taking screenshot of the opened page
		   TakesScreenshot ts8= (TakesScreenshot)d;
		   File src8 = ts8.getScreenshotAs(OutputType.FILE);
		// specifying the target location where the screenshot is to be saved   
		   File trg8 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1366×768\\Screenshot-9thMay-05.41pm.png");
		// copying the screenshot from source location to target location
		   FileHandler.copy(src8, trg8);
		// navigating back to the displayed list of pages
		   d.navigate().back();   
		
		// locating and clicking the link of the 4th page from the displayed list of pages
		   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();
		// taking screenshot of the opened page
		   TakesScreenshot ts9= (TakesScreenshot)d;
		   File src9 = ts9.getScreenshotAs(OutputType.FILE);
		// specifying the target location where the screenshot is to be saved   
		   File trg9 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1366×768\\Screenshot-9thMay-05.42pm.png");
		// copying the screenshot from source location to target location
		   FileHandler.copy(src9, trg9);
		// navigating back to the displayed list of pages
		   d.navigate().back();
		   
		// locating and clicking the link of the 5th page from the displayed list of pages
		   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a")).click();
		// taking screenshot of the opened page
		   TakesScreenshot ts10= (TakesScreenshot)d;
		   File src10 = ts10.getScreenshotAs(OutputType.FILE);
		// specifying the target location where the screenshot is to be saved   
		   File trg10 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1366×768\\Screenshot-9thMay-05.43pm.png");
		// copying the screenshot from source location to target location
		   FileHandler.copy(src10, trg10);
		// navigating back to the displayed list of pages
		   d.navigate().back();   
		   
		// closing the window
		   d.close();
		   
//-------------------------------------------------------------------------------   
		   System.setProperty("webDriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			// starting webdriver
			d=new ChromeDriver();
			// maximising the browser window
			d.manage().window().maximize();
			// applying implicit wait
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// navigating to base url
			d.get("https://www.getcalley.com/page-sitemap.xml");

// setting the browser window dimension to be '1536×864'
			
		   Dimension d3=new Dimension(1536,864);
			d.manage().window().setSize(d3);
			
			// locating and clicking the link of the 1st page from the displayed list of pages
			   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
			// taking screenshot of the opened page
			   TakesScreenshot ts11= (TakesScreenshot)d;
			   File src11 = ts11.getScreenshotAs(OutputType.FILE);
			// specifying the target location where the screenshot is to be saved   
			   File trg11 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1536×864\\Screenshot-9thMay-05.44pm.png");
			// copying the screenshot from source location to target location
			   FileHandler.copy(src11, trg11);
			// navigating back to the displayed list of pages
			   d.navigate().back();
			   
			// locating and clicking the link of the 2nd page from the displayed list of pages
			   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a")).click();
			// taking screenshot of the opened page
			   TakesScreenshot ts12= (TakesScreenshot)d;
			   File src12 = ts12.getScreenshotAs(OutputType.FILE);
			// specifying the target location where the screenshot is to be saved   
			   File trg12 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1536×864\\Screenshot-9thMay-05.45pm.png");
			// copying the screenshot from source location to target location
			   FileHandler.copy(src12, trg12);
			// navigating back to the displayed list of pages
			   d.navigate().back();
			 
			// locating and clicking the link of the 3rd page from the displayed list of pages
			   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a")).click();
			// taking screenshot of the opened page
			   TakesScreenshot ts13= (TakesScreenshot)d;
			   File src13 = ts13.getScreenshotAs(OutputType.FILE);
			// specifying the target location where the screenshot is to be saved   
			   File trg13 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1536×864\\Screenshot-9thMay-05.46pm.png");
			// copying the screenshot from source location to target location
			   FileHandler.copy(src13, trg13);
			// navigating back to the displayed list of pages
			   d.navigate().back();   
			
			// locating and clicking the link of the 4th page from the displayed list of pages
			   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();
			// taking screenshot of the opened page
			   TakesScreenshot ts14= (TakesScreenshot)d;
			   File src14 = ts14.getScreenshotAs(OutputType.FILE);
			// specifying the target location where the screenshot is to be saved   
			   File trg14 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1536×864\\Screenshot-9thMay-05.47pm.png");
			// copying the screenshot from source location to target location
			   FileHandler.copy(src14, trg14);
			// navigating back to the displayed list of pages
			   d.navigate().back();
			   
			// locating and clicking the link of the 5th page from the displayed list of pages
			   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a")).click();
			// taking screenshot of the opened page
			   TakesScreenshot ts15= (TakesScreenshot)d;
			   File src15 = ts15.getScreenshotAs(OutputType.FILE);
			// specifying the target location where the screenshot is to be saved   
			   File trg15 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Desktop\\1536×864\\Screenshot-9thMay-05.48pm.png");
			// copying the screenshot from source location to target location
			   FileHandler.copy(src15, trg15);
			// navigating back to the displayed list of pages
			   d.navigate().back();   
			   
			// closing the window
			   d.close();	
			   
//-------------------------------------------------------------------------------   
			   System.setProperty("webDriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				// starting webdriver
				d=new ChromeDriver();
				// maximising the browser window
				d.manage().window().maximize();
				// applying implicit wait
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// navigating to base url
				d.get("https://www.getcalley.com/page-sitemap.xml");

// setting the browser window dimension to be '360×640'
				
			   Dimension d4=new Dimension(360,640);
				d.manage().window().setSize(d4);
				
				// locating and clicking the link of the 1st page from the displayed list of pages
				   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
				// taking screenshot of the opened page
				   TakesScreenshot ts16= (TakesScreenshot)d;
				   File src16 = ts16.getScreenshotAs(OutputType.FILE);
				// specifying the target location where the screenshot is to be saved   
				   File trg16 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\360×640\\Screenshot-9thMay-06.00pm.png");
				// copying the screenshot from source location to target location
				   FileHandler.copy(src16, trg16);
				// navigating back to the displayed list of pages
				   d.navigate().back();
				   
				// locating and clicking the link of the 2nd page from the displayed list of pages
				   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a")).click();
				// taking screenshot of the opened page
				   TakesScreenshot ts17= (TakesScreenshot)d;
				   File src17 = ts17.getScreenshotAs(OutputType.FILE);
				// specifying the target location where the screenshot is to be saved   
				   File trg17 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\360×640\\Screenshot-9thMay-06.02pm.png");
				// copying the screenshot from source location to target location
				   FileHandler.copy(src17, trg17);
				// navigating back to the displayed list of pages
				   d.navigate().back();
				 
				// locating and clicking the link of the 3rd page from the displayed list of pages
				   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a")).click();
				// taking screenshot of the opened page
				   TakesScreenshot ts18= (TakesScreenshot)d;
				   File src18 = ts18.getScreenshotAs(OutputType.FILE);
				// specifying the target location where the screenshot is to be saved   
				   File trg18 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\360×640\\Screenshot-9thMay-06.03pm.png");
				// copying the screenshot from source location to target location
				   FileHandler.copy(src18, trg18);
				// navigating back to the displayed list of pages
				   d.navigate().back();   
				
				// locating and clicking the link of the 4th page from the displayed list of pages
				   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();
				// taking screenshot of the opened page
				   TakesScreenshot ts19= (TakesScreenshot)d;
				   File src19 = ts19.getScreenshotAs(OutputType.FILE);
				// specifying the target location where the screenshot is to be saved   
				   File trg19 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\360×640\\Screenshot-9thMay-06.04pm.png");
				// copying the screenshot from source location to target location
				   FileHandler.copy(src19, trg19);
				// navigating back to the displayed list of pages
				   d.navigate().back();
				   
				// locating and clicking the link of the 5th page from the displayed list of pages
				   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a")).click();
				// taking screenshot of the opened page
				   TakesScreenshot ts20= (TakesScreenshot)d;
				   File src20 = ts20.getScreenshotAs(OutputType.FILE);
				// specifying the target location where the screenshot is to be saved   
				   File trg20 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\360×640\\Screenshot-9thMay-06.05pm.png");
				// copying the screenshot from source location to target location
				   FileHandler.copy(src20, trg20);
				// navigating back to the displayed list of pages
				   d.navigate().back();   
				   
				// closing the window
				   d.close();	
				   
//-------------------------------------------------------------------------------   
				   System.setProperty("webDriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					// starting webdriver
					d=new ChromeDriver();
					// maximising the browser window
					d.manage().window().maximize();
					// applying implicit wait
					d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					// navigating to base url
					d.get("https://www.getcalley.com/page-sitemap.xml");

// setting the browser window dimension to be '414×896'
					
				   Dimension d5=new Dimension(414,896);
					d.manage().window().setSize(d5);
					
					// locating and clicking the link of the 1st page from the displayed list of pages
					   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
					// taking screenshot of the opened page
					   TakesScreenshot ts21= (TakesScreenshot)d;
					   File src21 = ts21.getScreenshotAs(OutputType.FILE);
					// specifying the target location where the screenshot is to be saved   
					   File trg21 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\414×896\\Screenshot-9thMay-06.10pm.png");
					// copying the screenshot from source location to target location
					   FileHandler.copy(src21, trg21);
					// navigating back to the displayed list of pages
					   d.navigate().back();
					   
					// locating and clicking the link of the 2nd page from the displayed list of pages
					   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a")).click();
					// taking screenshot of the opened page
					   TakesScreenshot ts22= (TakesScreenshot)d;
					   File src22 = ts22.getScreenshotAs(OutputType.FILE);
					// specifying the target location where the screenshot is to be saved   
					   File trg22 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\414×896\\Screenshot-9thMay-06.12pm.png");
					// copying the screenshot from source location to target location
					   FileHandler.copy(src22, trg22);
					// navigating back to the displayed list of pages
					   d.navigate().back();
					 
					// locating and clicking the link of the 3rd page from the displayed list of pages
					   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a")).click();
					// taking screenshot of the opened page
					   TakesScreenshot ts23= (TakesScreenshot)d;
					   File src23 = ts23.getScreenshotAs(OutputType.FILE);
					// specifying the target location where the screenshot is to be saved   
					   File trg23 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\414×896\\Screenshot-9thMay-06.13pm.png");
					// copying the screenshot from source location to target location
					   FileHandler.copy(src23, trg23);
					// navigating back to the displayed list of pages
					   d.navigate().back();   
					
					// locating and clicking the link of the 4th page from the displayed list of pages
					   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();
					// taking screenshot of the opened page
					   TakesScreenshot ts24= (TakesScreenshot)d;
					   File src24 = ts24.getScreenshotAs(OutputType.FILE);
					// specifying the target location where the screenshot is to be saved   
					   File trg24 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\414×896\\Screenshot-9thMay-06.14pm.png");
					// copying the screenshot from source location to target location
					   FileHandler.copy(src24, trg24);
					// navigating back to the displayed list of pages
					   d.navigate().back();
					   
					// locating and clicking the link of the 5th page from the displayed list of pages
					   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a")).click();
					// taking screenshot of the opened page
					   TakesScreenshot ts25= (TakesScreenshot)d;
					   File src25 = ts25.getScreenshotAs(OutputType.FILE);
					// specifying the target location where the screenshot is to be saved   
					   File trg25 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\414×896\\Screenshot-9thMay-06.15pm.png");
					// copying the screenshot from source location to target location
					   FileHandler.copy(src25, trg25);
					// navigating back to the displayed list of pages
					   d.navigate().back();   
					   
					// closing the window
					   d.close();	
					   
//-------------------------------------------------------------------------------   
					   System.setProperty("webDriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
						// starting webdriver
						d=new ChromeDriver();
						// maximising the browser window
						d.manage().window().maximize();
						// applying implicit wait
						d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						// navigating to base url
						d.get("https://www.getcalley.com/page-sitemap.xml");

	// setting the browser window dimension to be '375×667'
						
					   Dimension d6=new Dimension(375,667);
						d.manage().window().setSize(d6);
						
						// locating and clicking the link of the 1st page from the displayed list of pages
						   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
						// taking screenshot of the opened page
						   TakesScreenshot ts26= (TakesScreenshot)d;
						   File src26 = ts26.getScreenshotAs(OutputType.FILE);
						// specifying the target location where the screenshot is to be saved   
						   File trg26 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\375×667\\Screenshot-9thMay-06.30pm.png");
						// copying the screenshot from source location to target location
						   FileHandler.copy(src26, trg26);
						// navigating back to the displayed list of pages
						   d.navigate().back();
						   
						// locating and clicking the link of the 2nd page from the displayed list of pages
						   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a")).click();
						// taking screenshot of the opened page
						   TakesScreenshot ts27= (TakesScreenshot)d;
						   File src27 = ts27.getScreenshotAs(OutputType.FILE);
						// specifying the target location where the screenshot is to be saved   
						   File trg27 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\375×667\\Screenshot-9thMay-06.32pm.png");
						// copying the screenshot from source location to target location
						   FileHandler.copy(src27, trg27);
						// navigating back to the displayed list of pages
						   d.navigate().back();
						 
						// locating and clicking the link of the 3rd page from the displayed list of pages
						   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a")).click();
						// taking screenshot of the opened page
						   TakesScreenshot ts28= (TakesScreenshot)d;
						   File src28 = ts28.getScreenshotAs(OutputType.FILE);
						// specifying the target location where the screenshot is to be saved   
						   File trg28 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\375×667\\Screenshot-9thMay-06.33pm.png");
						// copying the screenshot from source location to target location
						   FileHandler.copy(src28, trg28);
						// navigating back to the displayed list of pages
						   d.navigate().back();   
						
						// locating and clicking the link of the 4th page from the displayed list of pages
						   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();
						// taking screenshot of the opened page
						   TakesScreenshot ts29= (TakesScreenshot)d;
						   File src29 = ts29.getScreenshotAs(OutputType.FILE);
						// specifying the target location where the screenshot is to be saved   
						   File trg29 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\375×667\\Screenshot-9thMay-06.34pm.png");
						// copying the screenshot from source location to target location
						   FileHandler.copy(src29, trg29);
						// navigating back to the displayed list of pages
						   d.navigate().back();
						   
						// locating and clicking the link of the 5th page from the displayed list of pages
						   d.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a")).click();
						// taking screenshot of the opened page
						   TakesScreenshot ts30= (TakesScreenshot)d;
						   File src30 = ts30.getScreenshotAs(OutputType.FILE);
						// specifying the target location where the screenshot is to be saved   
						   File trg30 = new File("C:\\Users\\User\\Desktop\\Eclipse_workspace\\TestCase_One\\Screenshots\\Mobile\\375×667\\Screenshot-9thMay-06.35pm.png");
						// copying the screenshot from source location to target location
						   FileHandler.copy(src30, trg30);
						// navigating back to the displayed list of pages
						   d.navigate().back();   
						   
						// closing the window
						   d.close();
	}
}

// ABOVE TESTCASE CANT BE AUTOMATED ON SAFARI BROWSER AS SAFARI DRIVER IS NO LONGER SUPPORTED ON WINDOWS 10
