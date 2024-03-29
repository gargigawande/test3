package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_Frames {
public static void main(String args[]) throws Exception{
   //Test Steps
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(5000);
//Enter into frame
driver.switchTo().frame("rightMenu");
//---click on Add btn
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
Thread.sleep(4000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("suresh");
driver.findElement(By.name("txtEmpLastName")).sendKeys("selenium");
Thread.sleep(4000);
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(4000);
System.out.println("New emp added");
//Exit from frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
System.out.println("Logout completed");
System.out.println("Testing Excellent");
driver.close();
}
}