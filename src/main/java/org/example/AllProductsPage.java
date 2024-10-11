package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class AllProductsPage {
    private SHAFT.GUI.WebDriver driver;

    public AllProductsPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By ProductButton = By.xpath("//a[@href=\"/products\"]");
    private By AllProduct = By.xpath("//h2[@class=\"title text-center\"]");
    private By ProductList = By.xpath("//div[@class=\"left-sidebar\"]");
    private By ViewProduct = By.xpath("//a[@href=\"/product_details/1\"]//i");
    private By ProductDetails = By.xpath("//div[@class=\"product-details\"]");
    private By ProductName = By.xpath("//div[@class=\"product-information\"]//h2");
    private By ProductCategory = By.xpath("//div[@class='product-information']//p[1]");
    private By ProductPrice = By.xpath("//div[@class=\"product-information\"]//span//span");
    private By ProductAvailability = By.xpath("//p/b[contains(text(),'Availability')]");
    private By ProductCondition = By.xpath("//p/b[contains(text(),'Condition')]");
    private By ProductBrand = By.xpath("//p/b[contains(text(),'Brand')]");

    public AllProductsPage navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        return this ;
    }

    public AllProductsPage clickOnProductButton() {
        driver.element().click(ProductButton);
        return this;
    }




    public AllProductsPage clickOnViewProduct() {
        driver.element().click(ViewProduct);
        return this;

    }


    @Step("Validate that the user is on Home Page")
    public AllProductsPage ValidateHomePage() {
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that the user is on product page")
    public AllProductsPage ValidateAllProduct(){
        driver.element().verifyThat(AllProduct).text().isEqualTo("ALL PRODUCTS");
        return this;
    }

    @Step("Validate that product list is visible")
    public AllProductsPage ValidateProductList(){
        driver.element().verifyThat(ProductList).text().contains("CATEGORY");
        return this;
    }

//    @Step("Validate that product details is visible")
//    public AllProductsPage ValidateProductDetails(){
//        driver.element().verifyThat(ProductDetails).text().contains("Add to cart");
//        return this;
//    }

    @Step("Validate that product name is visible")
    public AllProductsPage ValidateProductName(){
        driver.element().verifyThat(ProductName).text().contains("Blue Top");
        return this;
    }

    @Step("Validate that product category is visible")
    public AllProductsPage ValidateProductCategory(){
        driver.element().verifyThat(ProductCategory).text().contains("Category");
        return this;
    }

    @Step("Validate that product price is visible")
    public AllProductsPage ValidateProductPrice(){
        driver.element().verifyThat(ProductPrice).text().contains("Rs.");
        return this;
    }


    @Step("Validate that product availability is visible")
    public AllProductsPage ValidateProductAvailability(){
        driver.element().verifyThat(ProductAvailability).text().contains("Availability");
        return this;
    }



    @Step("Validate that product condition is visible")
    public AllProductsPage ValidateProductCondition(){
        driver.element().verifyThat(ProductCondition).text().contains("Condition");
        return this;
    }


    @Step("Validate that product brand is visible")
    public AllProductsPage ValidateProductBrand(){
        driver.element().verifyThat(ProductBrand).text().contains("Brand");
        return this;
    }














}