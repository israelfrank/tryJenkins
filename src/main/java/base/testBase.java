package base;

import java.io.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class testBase {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest logger;
	public static WebDriverWait wait;

	public static void initialization() throws IOException  {

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors", "--no-sandbox", "--disable-dev-shm-usage");

		//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors", "--no-sandbox", "--disable-dev-shm-usage");
		driver 		 = new ChromeDriver(options);
		System.out.println("its work");

		//driver 		 = new ChromeDriver();
		wait 		 = new WebDriverWait(driver, 30);
		extent 		 = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		extent.attachReporter(htmlReporter);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("checking");
		driver.navigate().to("http://172.19.0.1:3000");



	}


	public static void Login() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/section/div/form/div[2]/input")));

		driver.findElement(By.xpath("/html/body/section/section/div/form/div[2]/input")).sendKeys("eli@gmail.com");

		driver.findElement(By.xpath("/html/body/section/section/div/form/div[3]/input")).sendKeys("0533346872");

		driver.findElement(By.className("btn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[3]/button")));
System.out.println("dasdsaasd123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button")).click();

		Thread.sleep(2000);


	}


}





