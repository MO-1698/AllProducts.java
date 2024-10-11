import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.AllProductsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllProductsTests {
    private SHAFT.GUI.WebDriver driver;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate All Products and product details page")
    private void validateAllProducts() {
        new AllProductsPage(driver).navigateToURL("https://automationexercise.com/")
                .ValidateHomePage().clickOnProductButton().ValidateAllProduct().ValidateProductList()
                .clickOnViewProduct() .ValidateProductName().ValidateProductCategory()
                .ValidateProductPrice().ValidateProductAvailability().ValidateProductCondition()
                .ValidateProductBrand();
    }
}