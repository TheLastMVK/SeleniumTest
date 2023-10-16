import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ClassBase {
    protected WebDriver driver;
    public ClassBase(WebDriver driver){
     this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebDriver chromeDriverConnection (){
        System.setProperty("web-driver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    //Permite aislar la clase Page de los comandos de Selenium
    //si selenium web driver cambia de version y impacta en los comandos que utilizamos, solo modificamos la ClaseBase, para aislar la clase Page
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    //Devuelve el texto del elemento que estamos buscando a travez de ese localizador
    public String getText(WebElement element){
        return element.getText();
    }

    public void clear (By locator)  {
        driver.findElement(locator).clear();
    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
            driver.findElement(locator).click();
    }

    public Boolean isDisplayed (By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    public void visit (String url) {
        driver.get(url);
    }

}
