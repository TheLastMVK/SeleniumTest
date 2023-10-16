import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ClassPageConfirm extends ClassBase {
    By LblInfContacName = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[1]/div/div/div/div[1]/div[1]/div[2]");
    By LblInfContacEmail = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[1]/div/div/div/div[1]/div[1]/div[3]");
    By LblPayMethod = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[1]/div/div/div/div[2]/div[1]/div[2]");
    By LblShippAddress = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[1]/div/div/div/div[1]/div[2]/div[2]/div/div[2]");
    By LblBillAddress = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[1]/div/div/div/div[1]/div[2]/div[2]/div/div[2]");
    public ClassPageConfirm (WebDriver driver) {
        super(driver);
    }
    public void confirmPay() throws InterruptedException {
    try {
        if (driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[1]/div/h3/div[2]/div")).isDisplayed()){
            System.out.println("SE CONFIRMA EL PAGO DE FORMA EXITOSA");
        }
    }catch (Exception e){
        System.out.println("SE REPORTA DEMORA DE CONFIRMACIÓN, ESPERAR O REPETIR EL PROCESO");
    }
        Assert.assertEquals(getText(LblInfContacName), Utils.names);
        System.out.println("La información del contacto NOMBRE es: " + getText(LblInfContacName));

        Assert.assertEquals(getText(LblInfContacEmail), Utils.mail);
        System.out.println("La información del contacto EMAIL es: " + getText(LblInfContacEmail));

        Assert.assertEquals(getText(LblPayMethod), "Credit Card");
        System.out.println("La información del metodo de PAGO es: " + getText(LblPayMethod));

        Assert.assertEquals(getText(LblShippAddress), Utils.address);
        System.out.println("La Dirección de Envio es: " + getText(LblShippAddress));

        Assert.assertEquals(getText(LblBillAddress), Utils.address);
        System.out.println("La Dirección de Facturacion es: " + getText(LblBillAddress));
    }
}
