package com.runnerclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runnerclass {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashokms\\eclipse-workspace\\Maven_projectbd\\src\\test\\java\\com\\runnerclass\\chromedriver.exe");
		driver=new ChromeDriver();

			
			driver.get("https://adactinhotelapp.com/index.php");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			
			driver.findElement(By.name("username")).sendKeys("TesterMSD7");
			
			
			driver.findElement(By.id("password")).sendKeys("Testerpass31");
		    driver.findElement(By.xpath("//input[@type='Submit']")).click();
			
			Thread.sleep(5000);
			
			WebElement location = driver.findElement(By.name("location"));
			Select place=new Select(location);
			place.selectByVisibleText("New York");
			
			WebElement hotel = driver.findElement(By.id("hotels"));
			Select hotelname=new Select(hotel);
			hotelname.selectByVisibleText("Hotel Hervey");
			
			WebElement room = driver.findElement(By.xpath("//*[@name='room_type']"));
			Select roomtype=new Select(room);
			roomtype.selectByVisibleText("Super Deluxe");
			
			WebElement numberofrooms = driver.findElement(By.xpath("//*[@name='room_nos']"));
			Select rooms=new Select(numberofrooms);
			rooms.selectByVisibleText("3 - Three");
			
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("13/07/2022");
			
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("15/07/2022");
			
			WebElement members = driver.findElement(By.xpath("(//*[@class='search_combobox'])[5]"));
			Select numbers=new Select(members);
			numbers.selectByVisibleText("4 - Four");
			
			
			WebElement children = driver.findElement(By.xpath("(//*[@class='search_combobox'])[6]"));
			Select noofchild=new Select(children);
			noofchild.selectByVisibleText("2 - Two");
			
			Thread.sleep(5000);
			
			driver.findElement(By.name("Submit")).click();
			driver.findElement(By.xpath("//input[@type='radio']")).click();
			
			driver.findElement(By.name("continue")).click();
			Thread.sleep(3000);
				
			driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("ASHOK");
			driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("KUMAR");
			
			driver.findElement(By.name("address")).sendKeys("chennai");
			driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("0123456789012345");
			
			WebElement card = driver.findElement(By.xpath("//select[@class='select_combobox']"));
			Select cardtype=new Select(card);
			cardtype.selectByVisibleText("VISA");

			
			WebElement expmonth = driver.findElement(By.xpath("//select[@class='select_combobox2']"));
			Select month=new Select(expmonth);
			month.selectByVisibleText("August");

			
			WebElement expyear = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
			Select year=new Select(expyear);
			year.selectByVisibleText("2022");

			
			driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("123");
			
			driver.findElement(By.xpath("//input[@value='Book Now']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.name("logout")).click();
			
			File targetimg=new File("C:\\Users\\ashokms\\eclipse-workspace\\seleniumpractice\\src\\adactin.jpg");

			TakesScreenshot ts= (TakesScreenshot)driver;
			File sourceimg= ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyDirectory(sourceimg, targetimg);
			

			}
			
				


}
