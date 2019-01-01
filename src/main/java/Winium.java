import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Winium
{
	public static void main(String [] args) throws MalformedURLException, InterruptedException
	{
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(5000);
		driver.findElement(By.name("7")).click();
		driver.findElement(By.name("Add")).click();
		driver.findElement(By.name("3")).click();
		driver.findElement(By.name("Equals")).click();
		Thread.sleep(5000);
		//String Result = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		WebElement element = driver.findElement(By.id("158"));
		boolean Result = element.isEnabled();
		System.out.println(Result);
		System.out.println("Do hell with you :-)");
		
		
				
	}
}