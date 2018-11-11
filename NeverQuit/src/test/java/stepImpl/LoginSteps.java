package stepImpl;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions
public class LoginSteps
{
ChromeDriver driver;
@Given("Launch the browser")
public void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver","");
}
}