import java.util.Random;

public class Utils {
final static String BASE_URL = "https://demo.evershop.io/";
final static String CHROME_DRIVER_LOCATION = "src\\main\\resources\\drivers\\chromedriver.exe";
final static Random random = new Random();
final static Integer ranCant = random.nextInt(10)+1;
public static String prodCant = String.valueOf(ranCant);



}
