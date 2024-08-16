package OrganizationTest;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtiger.genericUtility.Base;
import com.vtiger.genericUtility.JavaUtility;
import com.vtiger.objectrepos.CreateNewOrganizationPage;
import com.vtiger.objectrepos.HomePage;
import com.vtiger.objectrepos.OrgainizationPage;
import com.vtiger.objectrepos.OrgainzationInformationPage;

public class CreatOrgainzationTest extends Base  {
//test class contains only @test annotation
	@Test
	public void creatorg() throws Throwable {
		HomePage hp=new HomePage(driver);
		hp.clickOnOrgLink();
		//click on lookup img
		OrgainizationPage op=new OrgainizationPage(driver);
		op.clickonlookimg();
		//give name it and save
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		cnop.createNewOrgainzation("TCS"+jutil.getRandomNum());
		
		//get header
		OrgainzationInformationPage oip=new OrgainzationInformationPage(driver);
		String header = oip.getHeaderText();
		wutil.getScreenshot(driver);
		//validation
		SoftAssert s=new SoftAssert();
		s.assertTrue(header.contains("TCS"));
		Reporter.log("==ORGANIATION IS CREATED AND TC IS PASSED");
		s.assertAll();
	}
}
