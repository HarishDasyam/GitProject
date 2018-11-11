package testcases;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;
public class TC001CreateLead extends ProjectMethods
{
	@BeforeTest
		public void setData() 
		{
			testCaseName = "TC001_CreateLead";
			testDescription = "Create A new Lead";
			authors = "gopi";
			category = "smoke";
		}
	@Test
	public void createLead()
	{
		WebElement cl = locateElement("link", "Create Lead");
		click(cl);
		type(locateElement("createLeadForm_companyName"), "TL");
		type(locateElement("createLeadForm_firstName"), "Koushik");
		type(locateElement("createLeadForm_lastName"), "Chatterjee");
		click(locateElement("class", "smallSubmit"));
	}	
}