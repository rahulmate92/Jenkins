package Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {

	@Test
	public void dropDown() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();

		d1.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement e1 = d1.findElement(By.id("dropdown1"));

		Select sel1 = new Select(e1);

		sel1.selectByIndex(2);

		WebElement e2 = d1.findElement(By.name("dropdown2"));

		Select sel2 = new Select(e2);

		sel2.selectByVisibleText("Appium");

		WebElement e3 = d1.findElement(By.id("dropdown3"));

		Select sel3 = new Select(e3);
		sel3.selectByValue("2");

		// No.of dropdowns

		Select se = new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select")));

		List<WebElement> l = se.getOptions();
		int n = l.size();

		System.out.println("No. of dropdowns " + n);

		// Select Multiple options from dropdown "isMultiple()"

		Select list = new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
		boolean value = list.isMultiple();
		System.out.print(value);

		WebElement e4 = d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));

		Select sel4 = new Select(e4);

		sel4.selectByValue("2");
		sel4.selectByIndex(4);
		sel4.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		sel4.deselectByIndex(2);

	}

}