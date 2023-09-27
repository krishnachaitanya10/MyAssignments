package week3HomAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.get("https://www.ajio.com/");
		cd.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
		cd.findElement(By.xpath("//span[@class='ic-search']")).click();
		cd.findElement(By.xpath("//span[text()='gender']"));
		cd.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		String str1 = cd.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(str1);
		
		List<WebElement> Brands = cd.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(Brands);
		
		for(int i=0;i<Brands.size();i++) {
			String str2 = Brands.get(i).getText();
			System.out.println(str2);
		}
		
		
		
		
		
		
		

	}

}
