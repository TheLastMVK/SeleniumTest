import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ClassPageKid extends ClassBase{

    By GetProd3 = By.xpath ("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[3]/div[1]/a/img");
    By TxtCant = By.name  ("qty");
    By ListTalla3 = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a");
    By ListColor3 = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]/a");
    By AddCar = By.className ("button");
    public ClassPageKid (WebDriver driver) {
        super(driver);
    }
    public void productKid() throws InterruptedException {
        click(GetProd3);
        clear(TxtCant);
        type(Utils.prodCant ,TxtCant);
        click(ListTalla3);
        click(ListColor3);
        Thread.sleep(2000);
        click(AddCar);
        Thread.sleep(3000);
    }


}
