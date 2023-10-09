// Page URL: https://formy-project.herokuapp.com/form
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.devtools.CdpVersionFinder;
import java.util.Set;
import javax.lang.model.element.Element;
import org.openqa.selenium.JavascriptExecutor;
public class WebForm extends PageObject{


    /*EDITAR CORREO ANTES DE CADA EJECUCIÓN (COLOCAR UN CORRELATIVO)*/
    private final String userMail = "ing.jorgecisneroscab26@gmail.com";
    private final String userName = "Jorge Daniel Cisneros Cabello";
    private final String userPass = "JorDanCis123";
    private final String userPhone = "992229526";
    private final String userAddress = "Av. Rafael Escardo 620";
    private final String userCity = "Lima - San Miguel";
    private final String userPostal = "20002";
    private final String userCardNum = "4242424242";

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div[3]")
    private WebElement submit_button;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[2]/div/div/div/a[1]")
    private WebElement BtnCreate;

    @FindBy(className = "form-submit-button")
    private WebElement BtnSignup;

    @FindBy(name = "full_name")
    private WebElement TxtName;
    @FindBy(name = "email")
    private WebElement TxtMail;
    @FindBy(name = "password")
    private WebElement TxtPass;
    @FindBy(name = "address[full_name]")
    private WebElement TxtNameComprador;
    @FindBy(name = "address[telephone]")
    private WebElement TxtPhoneComprador;
    @FindBy(name = "address[address_1]")
    private WebElement TxtAddressComprador;
    @FindBy(name = "address[city]")
    private WebElement TxtCityComprador;
    @FindBy(name = "address[postcode]")
    private WebElement TxtPostalComprador;



    /*OBJETOS CREADOS PARA LA COMPRA DEL 1ER PRODUCTO*/
    @FindBy(linkText = "Men")
    private WebElement HrefMen;
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[5]/div[1]")
    private WebElement GetProd;
    @FindBy(name = "qty")
    private WebElement TxtCant;
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]/a")
    private WebElement ListTalla;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a")
    private WebElement ListColor;

    @FindBy(className= "button")
    private WebElement AddCar;

    public void enlazarCatalogoCaballero(){
        this.HrefMen.click();
    }
    public void seleccion1erProducto(){
        this.GetProd.click();
    }
    public void cantidad1erProducto(){
        this.TxtCant.clear();
        this.TxtCant.sendKeys(Utils.prodCant);
    }
    public void talla1erProducto(){
        this.ListTalla.click();
    }
    public void color1erProducto(){
        this.ListColor.click();
    }
    public void agregarProducto(){
        this.AddCar.click();
    }

    /*OBJETOS CREADOS PARA LA COMPRA DEL 2DO PRODUCTO*/
    @FindBy(linkText = "Women")
    private WebElement HrefWomen;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[5]/div[1]/a/img")
    private WebElement GetProd2;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a")
    private WebElement ListTalla2;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a")
    private WebElement ListColor2;

    public void enlazarCatalogoDama(){
        this.HrefWomen.click();
    }
    public void seleccion2doProducto(){
        this.GetProd2.click();
    }
    public void talla2doProducto(){
        this.ListTalla2.click();
    }
    public void color2doProducto(){
        this.ListColor2.click();
    }

    /*OBJETOS CREADOS PARA LA COMPRA DEL 3ER PRODUCTO*/
    @FindBy(linkText = "Kids")
    private WebElement HrefKids;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[3]/div[1]/a/img")
    private WebElement GetProd3;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a")
    private WebElement ListTalla3;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]/a")
    private WebElement ListColor3;
    public void enlazarCatalogoKids(){
        this.HrefKids.click();
    }
    public void seleccion3erProducto(){
        this.GetProd3.click();
    }
    public void talla3erProducto(){
        this.ListTalla3.click();
    }
    public void color3erProducto(){
        this.ListColor3.click();
    }

    /*OBJETOS CREADOS PARA REGISTRAR LA COMPRA*/

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div[2]")
    private WebElement BtnCart;

    @FindBy(className = "shopping-cart-checkout-btn")
    private WebElement BtnShop;


    @FindBy(className = "button")
    private WebElement BtnConfirma;

    @FindBy(css= "svg[class='feather feather-circle']")
    private WebElement radioPay;

    public void selectMedioPago(){
        this.radioPay.click();
    }

    public void confirmaDatos(){
        this.BtnConfirma.click();
    }


    public void enlazarCarrito(){
        this.BtnCart.click();
    }

    public void presionarCompra(){
        this.BtnShop.click();
    }

    public void ingresaDatosComprador(){
        this.TxtNameComprador.sendKeys(userName);
        this.TxtPhoneComprador.sendKeys(userPhone);
        this.TxtAddressComprador.sendKeys(userAddress);
        this.TxtCityComprador.sendKeys(userCity);
        this.TxtPostalComprador.sendKeys(userPostal);
    }










    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }
    public void createAccount(){
        this.BtnCreate.click();
    }

    public void createUser(){
        this.BtnSignup.click();
    }
    public void enterFirstName(){
        this.TxtName.sendKeys(userName);
    }

    public void enterMail(){
        this.TxtMail.sendKeys(userMail);
    }
    public void enterPassword(){
        this.TxtPass.sendKeys(userPass);
    }


}