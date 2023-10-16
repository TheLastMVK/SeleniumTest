import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.AssertJUnit.*;

public class ClassTestPay {
    private WebDriver driver;
    ClassPagePay classPagePay;

    @BeforeTest
    public void setUp() {
        classPagePay = new ClassPagePay(driver);
        driver =  classPagePay.chromeDriverConnection();
        classPagePay.visit("https://demo.evershop.io/checkout/");
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void cleanUp(){
        //driver.manage().deleteAllCookies();
        //driver.close();
    }

    @Test (priority = 0, testName = "Registro del Primer Producto")
    public void test() throws InterruptedException{
        Thread.sleep(6000);
        classPagePay.payProducts();
    }

}
