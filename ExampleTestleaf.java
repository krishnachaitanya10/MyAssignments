import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleTestleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		ChromeDriver cc = new ChromeDriver();
		cc.get("http://leaftaps.com/opentaps/");
		cc.findElement(By.id("username")).sendKeys("demosalesmanager");
		cc.findElement(By.id("Password")).sendKeys("crmsfa");
		cc.findElement(By.id("login")).click();
		cc.findElement(By.linkText("CRM/SFA"));
		cc.findElement(By.partialLinkText("CRM")).click();
		cc.findElement(By.linkText("Leads")).click();
		cc.findElement(By.linkText("create Lead")).click();
		cc.findElement(By.id("Company Name")).sendKeys("Testleaf");
		cc.findElement(By.id("First Name")).sendKeys("Krishna chaitanya");
		cc.findElement(By.id("Last Name")).sendKeys("Udayagiri");
		
		
		WebElement select = cc.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select option = new Select(select);
		option.selectByIndex(4);
		
		WebElement select1 = cc.findElement(By.id("createLeadForm_marketingCampign"));
		
		Select option1 = new Select(select1);
		option1.selectByVisibleText("Automobile");
		
		WebElement select2 = cc.findElement(By.id("createLeadForm_ownership"));
		
		Select option2 = new Select(select2);
		option2.deselectByValue("Corporation");
		
		
		
		cc.findElement(By.name("Submit")).click();
		

	}

}
