
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.AssertJUnit.*;

public class ClassTestConfirm {
    private WebDriver driver;
    ClassPageConfirm classPageConfirm;

    @BeforeTest
    public void setUp() {
        classPageConfirm = new ClassPageConfirm(driver);
        driver =  classPageConfirm.chromeDriverConnection();
    }
    @AfterSuite
    public void cleanUp(){
        //driver.manage().deleteAllCookies();
        //driver.close();
    }
    @Test (priority = 0, testName = "Confirmaciones")
    public void test() throws InterruptedException{
        classPageConfirm.confirmPay();
    }


}
