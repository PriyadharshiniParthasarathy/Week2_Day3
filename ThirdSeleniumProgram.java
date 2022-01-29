package Week2_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ThirdSeleniumProgram {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.partialLinkText("Leads")).click();
driver.findElement(By.partialLinkText("Create Lead")).click();

//Enter all the fields in CreateLead page

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dharshini");
Select Source = new Select(driver.findElement(By.name("dataSourceId")));
Source.selectByVisibleText("Other");
Select Campaign = new Select(driver.findElement(By.name("marketingCampaignId")));
Campaign.selectByIndex(3);
driver.findElement(By.name("firstNameLocal")).sendKeys("Hello");
driver.findElement(By.name("lastNameLocal")).sendKeys("Hi");
driver.findElement(By.name("personalTitle")).sendKeys("Java");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/6/22");
driver.findElement(By.name("generalProfTitle")).sendKeys("Selenium");
driver.findElement(By.name("departmentName")).sendKeys("Automation Testing");
driver.findElement(By.name("annualRevenue")).sendKeys("10000");
Select Industry = new Select(driver.findElement(By.name("industryEnumId")));
Industry.selectByIndex(5);
Select Preferred_Currency = new Select(driver.findElement(By.name("currencyUomId")));
Preferred_Currency.selectByIndex(8);
Select Ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
Ownership.selectByVisibleText("Corporation");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
driver.findElement(By.name("sicCode")).sendKeys("A001");
driver.findElement(By.name("tickerSymbol")).sendKeys("$001");
driver.findElement(By.id("createLeadForm_description")).sendKeys("No comments");
driver.findElement(By.name("importantNote")).sendKeys("NA");

//Enter all the fields in contact information   
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("234");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("86231");
driver.findElement(By.name("primaryPhoneExtension")).sendKeys("123456");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test123@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Extended");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.gmail.com");

//Enter all the fields in Primary Address
driver.findElement(By.name("generalToName")).sendKeys("Hello");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Kuberan nagar");
driver.findElement(By.name("generalCity")).sendKeys("Chennai");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600210");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("789456");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Hi");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kuberan nagar 1st");
Select Country = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
Country.selectByIndex(5);



//Click on create Lead Button

driver.findElement(By.className("smallSubmit")).click();
	}

}
