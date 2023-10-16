import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTestWomen {
    private WebDriver driver;

    //Para usar los metodos de la pagina:
    ClassPageWomen classPageWomen;

    @BeforeTest
    public void setUp() {
        classPageWomen = new ClassPageWomen(driver);
        driver =  classPageWomen.chromeDriverConnection();
        classPageWomen.visit("https://demo.evershop.io/women/");
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void cleanUp(){
        //driver.manage().deleteAllCookies();
        //driver.close();
    }

    @Test (priority = 0, testName = "Registro del Segundo Producto")
    public void test() throws InterruptedException{
        classPageWomen.productWomen();
    }



}
