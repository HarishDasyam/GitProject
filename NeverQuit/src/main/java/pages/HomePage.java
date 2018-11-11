package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;
public class HomePage extends ProjectMethods
{
	public HomePage()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="CRM/")WebElement eleCRM; 
	@FindBy(how=How.CLASS_NAME,using ="decorativeSubmit")
	WebElement eleLogOut;
	public MyHome clickCRMSFA()
	{
		click(eleCRM);
		return new MyHome();
	}
	public LoginPage clickLogout()
	{
	click(eleLogOut);
	LoginPage lp = new LoginPage();
	return lp;
	}
}