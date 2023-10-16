import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.AssertJUnit.*;

public class ClassTestLogin {
    private WebDriver driver;
    //Para usar los metodos de la pagina:
    ClassPageLogin classPageLogin;

    @BeforeTest
    public void setUp() {
        classPageLogin = new ClassPageLogin(driver);
        driver =  classPageLogin.chromeDriverConnection();
        classPageLogin.visit("https://demo.evershop.io/account/login/");
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void cleanUp(){
        /*driver.manage().deleteAllCookies();
        driver.close();*/
    }

    @Test (priority = 0, testName = "Logeo de Usuario")
    public void test() throws InterruptedException{
        classPageLogin.loginUser();
        Thread.sleep(500);
        assertEquals("An Amazing EverShop Store", classPageLogin.isPageLoginDisplayed());
    }

}