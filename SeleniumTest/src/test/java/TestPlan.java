import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    public static WebForm webForm = new WebForm(driver);

    @Test(priority = 0, testName = "Ingreso Portal")
    public static void submitForm()throws InterruptedException{

        webForm.pressSubmitButton();
        webForm.createAccount();
        webForm.enterFirstName();
        webForm.enterMail();
        webForm.enterPassword();
        webForm.createUser();
        webForm.enlazarCatalogoCaballero();
        webForm.seleccion1erProducto();
        webForm.cantidad1erProducto();
        webForm.talla1erProducto();
        webForm.color1erProducto();
        Thread.sleep(2000);
        webForm.agregarProducto();
        webForm.enlazarCatalogoDama();
        webForm.seleccion2doProducto();
        webForm.cantidad1erProducto();
        webForm.talla2doProducto();
        webForm.color2doProducto();
        Thread.sleep(2000);
        webForm.agregarProducto();
        webForm.enlazarCatalogoKids();
        webForm.seleccion3erProducto();
        webForm.talla3erProducto();
        webForm.color3erProducto();
        Thread.sleep(2000);
        webForm.agregarProducto();
        webForm.enlazarCarrito();
        Thread.sleep(2000);
        webForm.presionarCompra();
        Thread.sleep(2000);
        webForm.ingresaDatosComprador();

        WebElement dropdownCountry = driver.findElement(By.id("address[country]"));
        Select selectC = new Select(dropdownCountry);
        selectC.selectByVisibleText("United States");
        Thread.sleep(2000);
        WebElement dropdownProvince = driver.findElement(By.id("address[province]"));
        Select selectP = new Select(dropdownProvince);
        selectP.selectByVisibleText("Washington");
        Thread.sleep(2000);
        WebElement radioMethod = driver.findElement(By.id("method0"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", radioMethod);
        webForm.confirmaDatos();
        Thread.sleep(3000);
        webForm.selectMedioPago();
        Thread.sleep(2000);

    }

    @AfterSuite
    public static void cleanUp(){
      /*  driver.manage().deleteAllCookies();
        driver.close(); */
    }
}