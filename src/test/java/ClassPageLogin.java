import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ClassPageLogin extends ClassBase{
    By LblLoginAccount = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div/h1");
    By TxtMail = By.name("email");
    By TxtPass = By.name("password");
    By BtnLogin = By.className("button");

    public ClassPageLogin (WebDriver driver) {
        super(driver);
    }
    public void loginUser() throws InterruptedException {
        if(isDisplayed(LblLoginAccount)){
            type(Utils.mail,TxtMail);
            type(Utils.password,TxtPass);
            click(BtnLogin);
        }else  {
            System.out.println("Login page was not found");
        }
    }
    public String isPageLoginDisplayed() {
        return driver.getTitle();
    }

}