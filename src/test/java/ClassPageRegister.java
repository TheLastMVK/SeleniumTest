import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ClassPageRegister extends ClassBase{

    //Uso de localizadores para establecer como objeto
    By LblCreateAccount = By.xpath("//*[@id=\"app\"]/div/main/div[1]/span[2]");
    By BtnSignup = By.className("form-submit-button");
    By TxtName = By.name("full_name");
    By TxtMail = By.name("email");
    By TxtPass = By.name("password");


    public ClassPageRegister (WebDriver driver) {
        super(driver);
    }
    //Asignación de las variables a los objetos localizados
    public void registerUser() throws InterruptedException {
        if(isDisplayed(LblCreateAccount)){
            type(Utils.names,TxtName);
            type(Utils.mail,TxtMail);
            type(Utils.password,TxtPass);
            click(BtnSignup);
        }else  {

            System.out.println("Register page was not found");
        }
    }
    public String isPageRegisterDisplayed() {
             return driver.getTitle();
    }


}