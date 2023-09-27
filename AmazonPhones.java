package week3HomAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver cc = new ChromeDriver();
		cc.manage().window().maximize();
		cc.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		cc.get("https://www.amazon.in/");
		
		cc.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']")).sendKeys("phones");
	    cc.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        List<WebElement> mobiles = cc.findElements(By.xpath("//span[@class='a-price-whole']")); 
        
        
        int total = mobiles.size();
        System.out.println("Total no.of Mobiles :"+total);
        
        List<Integer> numbers = new ArrayList<Integer>();
        
        for(WebElement result: mobiles) {
        	String price = (result.getText());
        	String priceText = price.replaceAll("[^0-9]", "");
        	int sortedprice = Integer.parseInt(priceText);
            numbers.add(sortedprice);
        }
        Collections.sort(numbers);
        System.out.println(numbers);
  
	}

}
