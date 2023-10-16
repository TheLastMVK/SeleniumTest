import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassPageWomen extends ClassBase{
    By GetProd2 = By.xpath ("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[5]/div[1]/a/img");
    By TxtCant = By.name  ("qty");
    By ListTalla2 = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a");
    By ListColor2 = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a");
    By AddCar = By.className ("button");
    public ClassPageWomen (WebDriver driver) {
        super(driver);
    }
    public void productWomen() throws InterruptedException {
        click(GetProd2);
        clear(TxtCant);
        type(Utils.prodCant ,TxtCant);
        click(ListTalla2);
        click(ListColor2);
        Thread.sleep(2000);
        click(AddCar);
        Thread.sleep(3000);
    }
}
