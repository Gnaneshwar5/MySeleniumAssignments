package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gnaneshwar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I'm an Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gnanesh@testleaf.com");
		WebElement State =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(State);
		sec.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		//edit
		driver.findElement(By.linkText("Edit")).click();
		//clear description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//fill important field with any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cool");
		//click on update button
		driver.findElement(By.className("smallSubmit")).click();
		//get title
		System.out.println("The title is:"+" "+driver.getTitle());

	}

}
