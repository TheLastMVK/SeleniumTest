import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

//SE CREA EL SUITE DE PRUEBAS POR CADA UNA DE LAS PRUEBAS DESDE EL INICIO DE SESIÓN HASTA LA COMPROBACIÓN DE LOS VALORES
//SE ENVIARÁ AL SuiteTest.xml, justo con la prueba de Creación de nuevo usuario.
public class SuiteTest{
    private static final WebDriver driver = new ChromeDriver();

    //Configuración del driver
    @BeforeTest
    public static void getLogicUrl(){
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().window().maximize();
    }

    //Inicio de Sesión
    @Test(priority = 0, testName = "Confirmación de Logeo")
    public static void Confirmación_de_Logeo() throws InterruptedException{
        driver.get("https://demo.evershop.io/account/login/");
        ClassPageLogin classPageLogin = new ClassPageLogin(driver);
        classPageLogin.loginUser();
        Thread.sleep(5000);
    }

    //Selección de los Datos para el 1er producto
    @Test (priority = 1, testName = "Compra de Producto 1")
    private void Compra_de_Producto_1() throws InterruptedException {
       driver.get("https://demo.evershop.io/men/");
       ClassPageMen classPageMen = new ClassPageMen(driver);
        classPageMen.productMen();
    }

    //Selección de los Datos para el 2do producto
    @Test (priority = 2, testName = "Compra de Producto 2")
    private void Compra_de_Producto_2() throws InterruptedException {
        driver.get("https://demo.evershop.io/women/");
        ClassPageWomen classPageWomen = new ClassPageWomen(driver);
        classPageWomen.productWomen();
    }

    //Selección de los Datos para el 3er producto
    @Test (priority = 3, testName = "Compra de Producto 3")
    private void Compra_de_Producto_3() throws InterruptedException {
        driver.get("https://demo.evershop.io/kids/");
        ClassPageKid classPageKid = new ClassPageKid(driver);
        classPageKid.productKid();
    }

    //Ingreso de datos del cliente
    // - Dirección, Codigo postal, pais, provincia - Tipo de pago y datos de la tarjeta
    @Test (priority = 4, testName = "Confirmación de Pago")
    private void Confirmación_de_Pago() throws InterruptedException {
        driver.get("https://demo.evershop.io/checkout/");
        Thread.sleep(5000);
        ClassPagePay classPagePay = new ClassPagePay(driver);
        classPagePay.payProducts();
    }

    //Ultimo test para validar las comprobaciones:
    // - Pedido Creado Correctamente - Validación de datos del Contacto
    // - Tipo de Pago - Dirección de envío, Dirección de facturación
    @Test (priority = 5, testName = "Confirmación de Datos")
    private void Confirmación_de_Datos() throws InterruptedException {
        Thread.sleep(5000);
        ClassPageConfirm classPageConfirm = new ClassPageConfirm(driver);
        classPageConfirm.confirmPay();
    }
}
