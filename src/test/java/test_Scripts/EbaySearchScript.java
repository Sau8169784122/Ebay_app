package test_Scripts;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.EbaySearchMultiple;

public class EbaySearchScript extends Base_Test {
	
@Test(dataProvider = "testdata")
public void Testcalling(String productname) throws InterruptedException {
		EbaySearchMultiple ebay=new EbaySearchMultiple(driver);
		ebay.Click_SearchTf();
	
		ebay.EnterProduct(productname);
		
		ebay.SearchButton();
		
		ebay.MatchProduct();
		
		ebay.selectvalues();
		
		ebay.BuyItNow();
		
		ebay.WorldwideBox();
		
		ebay.InternationalShippingBox();
		
		ebay.ReturnsExceptedclick();
		
		//ebay.SelectTheProduct();
		driver.navigate().back();
		
		String parentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(parentWindowHandle);

		
}

@DataProvider(name="testdata")
public Object[][] getTestData() throws IOException{
	Object[][] testdata = ReadExcel.getMultipleData("Sheet1");
	return testdata;

}
}