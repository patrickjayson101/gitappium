package collabera;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import utils.AndroidActions;

public class LaunchApplication extends BaseClass {
	@Test
	public void launchApp() throws MalformedURLException {
		
		formPage.clickOnElement(formPage.Preference);
		test.info("Clicked on Preference");
		formPage.navigateBack();
		formPage.clickOnElement(formPage.Views);
		test.info("Clicked on Views");
		test.info("Scroll to bottom WebViews");
		AndroidActions.scollToText("WebView");
		test.pass("Clicked on WebView");
		
	}
}
