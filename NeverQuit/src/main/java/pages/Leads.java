package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;
public class Leads extends ProjectMethods
{
	public Leads()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Find Leads")WebElement eleFL;
	@FindBy(how = How.PARTIAL_LINK_TEXT,using ="Merge Leads")
	WebElement eleML;
	public Leads clickFindLeads()
	{
		click(eleFL);
		return new Leads();
	}
	public Leads clickMergeLeads()
	{
		click(eleML);
		return new Leads();
	}
}