package stepImpl;
import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.CucumberOptions
import cucumber.api.java.en.Given;
public class LoginSteps
{
ChromeDriver driver;
@Given("Launch the browser")
public void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver","");
}
}