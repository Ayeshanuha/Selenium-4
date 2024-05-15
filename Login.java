package automationclass;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Driver Initialization
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Window & link 
		
	//	driver.get("https://trytestingthis.netlify.app/");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		//First Name
//		
//		driver.findElement(By.id("fname")).sendKeys("Aysha Shiddika");
//     	Thread.sleep(3000);
//
//		
//		//Last Name
//		
//		driver.findElement(By.id("lname")).sendKeys("Nuha");
//		Thread.sleep(3000);

		
//		//Gender
//		
//		WebElement radiobutton = driver.findElement(By.id("female"));
//		radiobutton.click();
//		
//		assert radiobutton.isSelected();//verify kori
//		System.out.println(radiobutton.isSelected());
//		Thread.sleep(2000);
//		//dropdown
//		
//		WebElement testdropdown=driver.findElement(By.id("option"));
//		Select dropdown = new Select(testdropdown);
//		dropdown.selectByIndex(1);
//		Thread.sleep(2000);
		//dropdown.selectByValue("option 3");
		//dropdown.selectByVisibleText("Option 1");
		
		//Checklist 2ta
		
//		WebElement checklist = driver.findElement(By.name("option2"));
//		checklist.click();
//		assert checklist.isSelected();
//
//		WebElement checklist1 = driver.findElement(By.name("option3"));
//		checklist1.click();
//		assert checklist1.isSelected();
//		Thread.sleep(2000);
//
//		//pic upload
//		
//		WebElement fileupload = driver.findElement(By.id("myfile"));
//		// Set the file path to upload
//        String filePath = "C:\\Users\\Dcode\\Pictures\\PHOTO.jpg";
//        fileupload.sendKeys(filePath);
//        Thread.sleep(2000);
//        // Submit the form 
//      
//        WebElement submitButton = driver.findElement(By.cssSelector("body > div.row > div.main > form > fieldset > button"));
//        submitButton.click();
		
//		Thread.sleep(3000);
//		driver.navigate().back();
		//driver.close();
		//drier.quit();
		
		//Login
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//Thread.sleep(3000);
		//driver.findElement(By.id("login-button")).click();
		
		//Relative path
	     //driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		//absolute path
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
		
		//Css path 
		driver.findElement(By.cssSelector("input#login-button")).click();
		
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/button[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[@id='checkout']")).click();
	     
	     driver.findElement(By.id("first-name")).sendKeys("Aysha Shiddika");
	     Thread.sleep(3000);
	     driver.findElement(By.id("last-name")).sendKeys("Nuha");
	     Thread.sleep(3000);
	     driver.findElement(By.id("postal-code")).sendKeys("1230");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@id='continue']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]/button[2]")).click();
	//	driver.manage().window().minimize();
		
		 //Title
		
		//if-Elsecheck
		
		//String ExpectedTitle="Swag Labs";
		//String ActualTitle = driver.getTitle();
		
		
		//System.out.println(ActualUrl);
		
//		if(ActualTitle.equals(ExpectedTitle)) {
//			System.out.println("Title Match");
//		}
//		else {
//			System.out.println("Title Not Match");
//			
//		}
		
//		Assert.assertEquals(ActualTitle, ExpectedTitle,"Condition True");
		        
		        //URL
//		
//		String ExpectedUrl="https://www.saucedemo.com/";
//		String ActualUrl = driver.getCurrentUrl();
//		
//
//		//IF=ELSE CHECK
//		
//		if(ActualUrl.equals(ExpectedUrl)) {
//			System.out.println("Url Match");
//		}
//		else {
//			System.out.println("Url Not Match");
//			
//		}
//		
//		//Assert
//		
//		Assert.assertEquals(ActualUrl, ExpectedUrl,"Condition True");
//		
	
	}

}
