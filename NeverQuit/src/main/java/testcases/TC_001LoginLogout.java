package testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;
public class TC_001LoginLogout extends ProjectMethods
{
@BeforeTest
public void setData()
{
	testCaseName = "Login Logout";
	testNodes="Login";
	testDescription="Login";
	category="Smoke";
	authors="HD";
	dataSheetName="TC001";
}
@Test(dataProvider="fetchData")
public void loginLogout(String uName,String pwd)
{
new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogin().clickLogout();
}
}