package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;
//Here we are writing page level actions, hence don't use @Test annotations
//@Test Annotations we use them in test cases not in pages
public class LoginPage extends ProjectMethods
{
public LoginPage()
{
PageFactory.initElements(driver, this);
}
@FindBy(how=How.ID, using ="username")
WebElement eleUserName;
@FindBy(how=How.ID, using ="password")
WebElement elePassword;
@FindBy(how=How.CLASS_NAME,using ="decorativeSubmit")
WebElement eleSubmit;
public LoginPage enterUserName(String userName)
{
type(eleUserName,userName);
return new LoginPage();
}
public LoginPage enterPassword(String passWord)
{
type(elePassword,passWord);
return new LoginPage();
}
public HomePage clickLogin()
{
click(eleSubmit);
return new HomePage();
}
}