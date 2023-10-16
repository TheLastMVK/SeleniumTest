import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.AssertJUnit.*;
public class ClassTestKid {
    private WebDriver driver;

    //Para usar los metodos de la pagina:
    ClassPageKid classPageKid;

    @BeforeTest
    public void setUp() {
        classPageKid = new ClassPageKid(driver);
        driver =  classPageKid.chromeDriverConnection();
        classPageKid.visit("https://demo.evershop.io/kids/");
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void cleanUp(){
        //driver.manage().deleteAllCookies();
        //driver.close();
    }

    @Test (priority = 0, testName = "Registro del Tercer Producto")
    public void test() throws InterruptedException{
        classPageKid.productKid();
    }

}
