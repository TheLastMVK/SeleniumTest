import org.openqa.selenium.devtools.v85.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;

//Creación de variables publicas para uso global de las clases (para insertar y comparar)
public class Utils {
    final static String mail = "ing.jorgecisneroscab69@gmail.com";
    final static String names = "Jorge Daniel Cisneros Cabello";
    final static String password = "JorDanCis123";
    final static String phone = "992229526";
    final static String address = "Av. Rafael Escardo 620";
    final static String city = "Lima - San Miguel";
    final static String postal = "20002";
    final static String card = "42424242424242420424242";
    final static  String CHROME_DRIVER_LOCATION = "src\\main\\resources\\drivers\\chromedriver.exe";
    final static Random random = new Random();
    final static Integer ranCant = random.nextInt(10)+1;
    public static String prodCant = String.valueOf(ranCant);
}