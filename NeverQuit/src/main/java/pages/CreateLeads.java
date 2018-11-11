package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
public class CreateLeads extends ProjectMethods
{
	public CreateLeads()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement eleFN;
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement eleLN;
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement eleCON;
	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	WebElement elesub;
	public CreateLeads enterFirstName(String fn)
	{
		type(eleFN,fn);
		return new CreateLeads();
	}
	public CreateLeads enterLastName(String ln)
	{
		type(eleLN,ln);
		return new CreateLeads();
	}
	public CreateLeads enterCompanyName(String con)
	{
		type(eleCON,con);
		return new CreateLeads();
	}
	public ViewLead clickCreateLead()
	{
		click(elesub);
		return new ViewLead();
	}
}