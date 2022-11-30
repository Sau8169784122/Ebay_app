package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EbaySearchMultiple extends BasePage {

	public EbaySearchMultiple(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath = "//input[@id='gh-ac']")
WebElement Searchtf;
public void Click_SearchTf() {
	clickAction(Searchtf);
}

@FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
WebElement searchProduct;
public void EnterProduct(String product_name) {
	enter_value(searchProduct, product_name );
}
@FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
WebElement SearchBtn;
public void SearchButton() {
	clickAction(SearchBtn);
	}
	
@FindBy(xpath = "//button[@aria-label='Sort selector. Best Match selected.']")
WebElement MatchDropdown;
public void MatchProduct() {
	clickAction(MatchDropdown);
}

@FindBy(linkText ="Time: newly listed")
WebElement Selectvalue;
public void selectvalues() {
	clickAction(Selectvalue);
}

@FindBy(xpath = "//input[@aria-label='Buy It Now']")
WebElement checkBuyItNow;
public void BuyItNow() {
	clickAction(checkBuyItNow);
}

@FindBy(xpath = "//input[@aria-label='Worldwide']")
WebElement checkWorldwide;
public void WorldwideBox() {
	clickAction(checkWorldwide);
}

@FindBy(xpath="//input[@aria-label='Free International Shipping']")
WebElement checkshipping;
public void InternationalShippingBox() {
	clickAction(checkshipping);
}

@FindBy(xpath = "//input[@aria-label='Returns Accepted']")
WebElement checkReturns;
public void ReturnsExceptedclick() {
	clickAction(checkReturns);
}


}

	






