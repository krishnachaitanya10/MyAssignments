import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcnPXBQsWbd9AXycQW8dzTsRev352Lclxqhcwdrww2IeF7Y-luUe8y922Gk0uKwEj-IyqUGpGDx3V8BB5akJJv6BsGmWP__Pj-z-pohGbT8xQ&smuh=25213&lh=Ac_m97smlcp0rCtQBKY");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("udayagirikittu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Uvmkc@2001");
		driver.findElement(By.className("login")).click();
		//driver.close();

	}

}
