package Week2_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.partialLinkText("Create")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Priyadharshini");
driver.findElement(By.id("lastNameField")).sendKeys("Parthasarathy");
driver.findElement(By.name("submitButton")).click();
WebElement Firstname =driver.findElement(By.id("viewContact_firstName_sp"));
String Firstname1= Firstname.getText();
System.out.println("Firstname:- " + Firstname1);
System.out.println("Browser title :- " +driver.getTitle());
driver.close();

}}

