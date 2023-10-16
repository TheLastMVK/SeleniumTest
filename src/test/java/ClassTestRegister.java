import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.AssertJUnit.*;

public class ClassTestRegister {

    private WebDriver driver;

    //Para usar los metodos de la pagina:
    ClassPageRegister classPageRegister;

    @BeforeTest
    public void setUp() {
        classPageRegister = new ClassPageRegister(driver);
        driver =  classPageRegister.chromeDriverConnection();
        classPageRegister.visit("https://demo.evershop.io/account/register/");
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void cleanUp(){
     //driver.manage().deleteAllCookies();
     //driver.close();
    }

    @Test (priority = 0, testName = "Registrar nuevo Usuario")
    public void test() throws InterruptedException{
        classPageRegister.registerUser();
        Thread.sleep(500);
        driver.manage().window().minimize();
        driver.manage().deleteAllCookies();
        driver.close();
    }
}