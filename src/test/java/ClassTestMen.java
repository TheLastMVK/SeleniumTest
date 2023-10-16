import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.AssertJUnit.*;

public class ClassTestMen{
    private WebDriver driver;

    //Para usar los metodos de la pagina:
    ClassPageMen classPageMen;

    @BeforeTest
    public void setUp() {
        classPageMen = new ClassPageMen(driver);
        driver =  classPageMen.chromeDriverConnection();
        classPageMen.visit("https://demo.evershop.io/men/");
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void cleanUp(){
        //driver.manage().deleteAllCookies();
        //driver.close();
    }

    @Test (priority = 0, testName = "Registro del Primer Producto")
    public void test() throws InterruptedException{
        classPageMen.productMen();
    }
}
