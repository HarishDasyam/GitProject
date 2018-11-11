package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;
public class MyHome extends ProjectMethods
{
		public MyHome()
		{
		PageFactory.initElements(driver, this);
		}
		@FindBy(how=How.PARTIAL_LINK_TEXT, using="Create Lead")
		WebElement eleCL;
		public Leads clickCreateLead()
		{
			click(eleCL);
			return new Leads();
		}
}