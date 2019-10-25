package newTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement>  rows = driver.findElements(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]"));
		System.out.println(rows.size());
		
		for(int i=0; i<rows.size(); i++){
			
			WebElement temp = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[" +(i+1)+"]/td[2]"));
			System.out.println("Element "+ (i+1) + " : "  + temp.getText());
			temp.click();
		}
		
		driver.quit();
		
		}
	
}
