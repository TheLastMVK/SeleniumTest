package Tests.Tranzact;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.CdpVersionFinder;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.Assert;
import java.sql.Driver;
import java.util.Random;
import java.util.Set;
import javax.lang.model.element.Element;


public class Tranzact1 {
    public String url = "https://demo.evershop.io/";
    WebDriver driver;

    @BeforeTest
    private void getBasicUrl(){
    System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
    }


    /*<-----Se selecciona opcion de Sesion de usuario------>*/

    @Test (priority = 0)
    private void getSession(){
        WebElement BtnSignin = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]"));
        BtnSignin.click();
    }

    /* -----------Automatizacion de creacion de Creacion de Perfil ----------------
    @Test (priority = 1)
    private void createAccount(){
        WebElement BtnCreate = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/div/a[1]"));
        BtnCreate.click();
    }

    @Test (priority = 2)
    private void datePersonal(){
        String userName = "Jorge Daniel Cisneros Cabello";
        String userMail = "ing.jorgecisneroscab@gmail.com";
        String userPass = "JorDanCis123";
        WebElement TxtName = driver.findElement(By.name("full_name"));
        WebElement TxtMail = driver.findElement(By.name("email"));
        WebElement TxtPass = driver.findElement(By.name("password"));
        TxtName.sendKeys(userName);
        TxtMail.sendKeys(userMail);
        TxtPass.sendKeys(userPass);
        WebElement BtnSignup = driver.findElement(By.className("form-submit-button"));
        BtnSignup.click();
    }
           -----------Automatizacion de creacion de Creacion de Perfil ----------------*/

    @Test (priority = 1)
    private void getLogin() throws InterruptedException {
        String userMail = "ing.jorgecisneroscab@gmail.com";
        String userPass = "JorDanCis123";

        WebElement TxtMail = driver.findElement(By.name("email"));
        WebElement TxtPass = driver.findElement(By.name("password"));

        TxtMail.sendKeys(userMail);
        TxtPass.sendKeys(userPass);

        WebElement BtnSignin = driver.findElement(By.className("button"));
        BtnSignin.click();
            Thread.sleep(2000);
    }


    @Test (priority = 2)
    private void getProduct1() throws InterruptedException {
        /*<-----Se selecciona categoria MEN como primer producto a comprar------>*/
        WebElement HrefMen = driver.findElement(By.linkText("Men"));
        HrefMen.click();

        /*<-----Se selecciona el producto------>*/
        WebElement GetProd = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[5]/div[1]"));
        GetProd.click();

        /*<-----Se ingresa una cantidad aleatoria del producto seleccionado: Rango de 1 a 10 unidades------>*/
        Random random = new Random();
        Integer ranCant = random.nextInt(10)+1;

        String prodCant = String.valueOf(ranCant);
        WebElement TxtCant= driver.findElement(By.name("qty"));
        TxtCant.clear();
        TxtCant.sendKeys(prodCant);

        /*<-----Se selecciona la Talla------>*/
        WebElement ListTalla = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]/a"));
        ListTalla.click();

        /*<-----Se selecciona el color------>*/
        WebElement ListColor = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a"));
        ListColor.click();

        /*<-----Agregar al Carrito de compras------>*/
        WebElement AddCar = driver.findElement(By.className("button"));
        Thread.sleep(2000);
        AddCar.click();
    }

    @Test (priority = 3)
    private void getProduct2() throws InterruptedException {
        /*<-----Se selecciona categoria WOMEN como primer producto a comprar------>*/
        WebElement HrefMen = driver.findElement(By.linkText("Women"));
        HrefMen.click();

        /*<-----Se selecciona el producto------>*/
        WebElement GetProd = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[5]/div[1]/a/img"));
        GetProd.click();

        /*<-----Se ingresa una cantidad aleatoria del producto seleccionado: Rango de 1 a 10 unidades------>*/
        Random random = new Random();
        Integer ranCant = random.nextInt(10)+1;

        String prodCant = String.valueOf(ranCant);
        WebElement TxtCant= driver.findElement(By.name("qty"));
        TxtCant.clear();
        TxtCant.sendKeys(prodCant);

        /*<-----Se selecciona la Talla------>*/
        WebElement ListTalla = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a"));
        ListTalla.click();

        /*<-----Se selecciona el color------>*/
        WebElement ListColor = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a"));
        ListColor.click();

        /*<-----Agregar al Carrito de compras------>*/
        WebElement AddCar = driver.findElement(By.className("button"));
        Thread.sleep(2000);
        AddCar.click();
    }

    @Test (priority = 4)
    private void getProduct3() throws InterruptedException {
        /*<-----Se selecciona categoria KIDS como primer producto a comprar------>*/
        WebElement HrefMen = driver.findElement(By.linkText("Kids"));
        HrefMen.click();

        /*<-----Se selecciona el producto------>*/
        WebElement GetProd = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[3]/div[1]/a/img"));
        GetProd.click();

        /*<-----Se ingresa una cantidad aleatoria del producto seleccionado: Rango de 1 a 10 unidades------>*/
        Random random = new Random();
        Integer ranCant = random.nextInt(10)+1;

        String prodCant = String.valueOf(ranCant);
        WebElement TxtCant= driver.findElement(By.name("qty"));
        TxtCant.clear();
        TxtCant.sendKeys(prodCant);

        /*<-----Se selecciona la Talla------>*/
        WebElement ListTalla = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a"));
        ListTalla.click();

        /*<-----Se selecciona el color------>*/
        WebElement ListColor = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]/a"));
        ListColor.click();

        /*<-----Agregar al Carrito de compras------>*/
        WebElement AddCar = driver.findElement(By.className("button"));
        Thread.sleep(2000);
        AddCar.click();
    }


    /*<-----Se selecciona opcion de Sesion de Compra de productos------>*/

    @Test (priority = 5)
    private void getCart() throws InterruptedException {

        WebElement BtnCart = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]"));
        BtnCart.click();

        Thread.sleep(2000);

        WebElement BtnShop = driver.findElement(By.className("shopping-cart-checkout-btn"));
        BtnShop.click();

        Thread.sleep(2000);

        String userName = "Jorge Daniel Cisneros Cabello";
        String userPhone = "992229526";
        String userAddress =  "Av. Rafael Escardo 620";
        String userCity = "Lima - San Miguel";
        String userPostal = "20002";

        Select CmdCountry = new Select (driver.findElement(By.id("address[country]")));
        CmdCountry.selectByVisibleText("United States");

        Select CmdProvince = new Select (driver.findElement(By.id("address[province]")));
        CmdProvince.selectByVisibleText("Washington");


        WebElement TxtName = driver.findElement(By.name("address[full_name]"));
        WebElement TxtPhone = driver.findElement(By.name("address[telephone]"));
        WebElement TxtAddress = driver.findElement(By.name("address[address_1]"));
        WebElement TxtCity = driver.findElement(By.name("address[city]"));
        WebElement TxtPostal = driver.findElement(By.name("address[postcode]"));


        TxtName.sendKeys(userName);
        TxtPhone.sendKeys(userPhone);
        TxtAddress.sendKeys(userAddress);
        TxtCity.sendKeys(userCity);
        TxtPostal.sendKeys(userPostal);

        Thread.sleep(3000);

        WebElement radioMethod = driver.findElement(By.id("method0"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", radioMethod);


        WebElement BtnPay = driver.findElement(By.className("button"));
        BtnPay.click();

        Thread.sleep(3000);
    }

    @Test (priority = 6)
    private void PayCredit() {
        WebElement radioPay = driver.findElement(By.cssSelector("svg[class='feather feather-circle']"));
        radioPay.click();
    }

}
