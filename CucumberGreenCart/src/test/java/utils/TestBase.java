package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{	
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	{   //FileInputStream converts your file into input stream
		//System.getProperty("user.dir")->project path at run time
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		//Properties- is a java class and have ability to read the files having .properties extention
		Properties prop=new Properties();
		//prop object have knowledge about all properties declared in properties file
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		if(driver==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
				driver=new ChromeDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
				//driver=new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);	
		}	
		return driver;
	}
}
