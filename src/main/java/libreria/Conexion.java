package libreria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Conexion {

    String url;
    String path;

    public Conexion() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static void conectar() {

        //* Identifica el Sistema Operativo *//
        String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        //System.out.print(os);

        if (os.contains("mac")){
            String path = Paths.get(System.getProperty("user.dir"),"/src/main/resources/drivers/chromedriver").toString();
            System.setProperty("webdriver.chrome.driver", path);
       }else {
            String path = Paths.get(System.getProperty("user.dir"), "\\src\\main\\resources\\drivers\\chromedriver.exe").toString();
            System.setProperty("webdriver.chrome.driver", path);
        }


        ///// levantar la pag

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.falabella.com/falabella-cl/");

        driver.manage().window().maximize();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[1]")));


    }
}
