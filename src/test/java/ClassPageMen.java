import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ClassPageMen extends ClassBase{
    By GetProd = By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[5]/div[1]");
    By TxtCant = By.name  ("qty");
    By ListTalla = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]/a");
    By ListColor = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a");
    By AddCar = By.className ("button");
    public ClassPageMen (WebDriver driver) {
        super(driver);
    }
    public void productMen() throws InterruptedException {
        click(GetProd);
        clear(TxtCant);
        type(Utils.prodCant ,TxtCant);
        click(ListTalla);
        click(ListColor);
        Thread.sleep(2000);
        click(AddCar);
        Thread.sleep(3000);
    }

}
