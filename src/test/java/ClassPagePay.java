import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClassPagePay extends ClassBase{
    By TxtName = By.name("address[full_name]");
    By TxtPhone = By.name("address[telephone]");
    By TxtAddress = By.name("address[address_1]");
    By TxtCity = By.name("address[city]");
    By TxtPostal = By.name("address[postcode]");
    By DpDwCountry = By.id("address[country]");
    By DpDwProvince = By.id("address[province]");
    By BtnPay = By.className("button");
    By RdbMethod = By.cssSelector("svg[class='feather feather-circle']");
    public ClassPagePay (WebDriver driver) {
        super(driver);
    }
    public void payProducts() throws InterruptedException {
        type(Utils.names, TxtName);
        type(Utils.phone, TxtPhone);
        type(Utils.address, TxtAddress);
        type(Utils.city, TxtCity);
        type(Utils.postal, TxtPostal);

        WebElement dropdownCountry = driver.findElement(DpDwCountry);
        Select selectC = new Select(dropdownCountry);
        selectC.selectByVisibleText("United States");
        Thread.sleep(2000);

        WebElement dropdownProvince = driver.findElement(DpDwProvince);
        Select selectP = new Select(dropdownProvince);
        selectP.selectByVisibleText("Washington");
        Thread.sleep(2000);

        WebElement radioMethod = driver.findElement(By.id("method0"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", radioMethod);
        click(BtnPay);
        Thread.sleep(2000);
        click(RdbMethod);
        Thread.sleep(2000);

        driver.switchTo().frame(0);
        //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")));

        //apuntando al objeto del frame
        WebElement TxtCarNum = driver.findElement(By.name("cardnumber"));
        TxtCarNum.sendKeys(Utils.card);

        driver.switchTo().defaultContent(); //focus in parent page
        WebElement BtnOrder = driver.findElement(By.xpath("//*[@id=\"checkoutPaymentForm\"]/div[4]/button"));
        BtnOrder.click();
        Thread.sleep(1000);
    }
}
