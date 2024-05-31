package BaseClass;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base {
	public static WebDriver driver;
	public static ExtentReports extentReports;
	public static File file;

	public static WebDriver browserlaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("incognito");
			driver = new ChromeDriver(option);
		} else if (name.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (name.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	protected void launchUrl(WebDriver driver, String url) {
		try {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
			driver.get(url);

		} catch (Exception e) {
			System.out.println("Error Occurs On The LaunchURL");
			e.printStackTrace();
		}
	}

	protected void ClickOnElement(WebDriver driver, WebElement element) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(element));
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void inputValues(WebDriver driver, WebElement element, int sec, String value) {

		try {
			new WebDriverWait(driver, Duration.ofSeconds(sec)).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendKey(By name, String text) {

		driver.findElement(name).sendKeys(text);
	}

//		public static WebDriver passInput(WebElement element , String value) {
//			element.sendKeys(value);
//			return driver;
//		}
	public void click(By name) {

		driver.findElement(name);
	}

	protected void implicitwait(int secs) {
		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void staticwait(int sec) {
		try {
			Thread.sleep(sec);

		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}

	protected void dropdown(WebElement element, String option, String value) {
		Select se = new Select(element);
		if (option.equalsIgnoreCase("Index")) {
			se.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("text")) {
			se.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("value")) {
			se.selectByValue(value);
		}
	}

	protected void Screenshots(WebDriver driver, String sstname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		try {

			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destination = new File(
					"C:\\Users\\91824\\eclipse-workspace\\MavenProject\\screenshot" + sstname + "png");
			FileHandler.copy(source, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void extentReportStart() {
		extentReports = new ExtentReports();
		file = new File("C:\\\\Users\\\\91824\\\\eclipse-workspace\\\\Testing\\\\Reports");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));

	}

	public void extentReportTearDown() throws IOException {
		extentReports.flush();
		file = new File("C:\\Users\\91824\\eclipse-workspace\\Testing\\Reports\\index.html");
		Desktop.getDesktop().browse((file).toURI());

	}

	public String fullScreenshots() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File desfile = new File("screenshot\\.png" + "_" + timeStamp + ".png");
		FileUtils.copyFile(scrfile, desfile);
		return desfile.getAbsolutePath();

	}

	public void terminateBrowser() {
		driver.close();
	}
	public void windowHandler(int index) {

		Set<String> windows = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windows);
		driver.switchTo().window(li.get(index));
	}

	public void JSFindElement(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}

	public void JSScrollBy(int dist) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + dist + ");", "");

	}

	public void clearText(WebElement element) {

		element.clear();
	}
	protected void jsClick(WebDriver driver, WebElement element) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void closeTab() {
		driver.close();
	}
	public void frameByIndex(int index) {

		driver.switchTo().frame(index);
	}
}
  











