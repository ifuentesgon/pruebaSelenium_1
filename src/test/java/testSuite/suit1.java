package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import testCases.test17_AbrirCaja;

import java.nio.file.Paths;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class suit1 {

    private WebDriver driver;
    private WebDriverWait wait;

/*
    @BeforeClass
    public void preparacion_tests(){
        //String path = Paths.get(System.getProperty("user.dir"),"\\src\\main\\resources\\drivers\\chromedriver").toString();
        //System.setProperty("webdriver.chrome.driver", path);



    }

    @BeforeMethod
    public void inicio_tests(){

    }

    @AfterMethod
    public void limpiar_tests(){
        driver.close();
    }

    @AfterTest
    public void post_ejecucion_tests(){
        System.out.println("Se finaliza la ejecución.");
    }
*/

    //(priority = 1, description = "Caso 1: Abrir Caja")
    @Test
    public void test17_AbrirCaja() {
        String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (os.contains("mac")){
            String path = Paths.get(System.getProperty("user.dir"),"/src/main/resources/drivers/chromedriver").toString();
            System.setProperty("webdriver.chrome.driver", path);
        }else {
            String path = Paths.get(System.getProperty("user.dir"), "\\src\\main\\resources\\drivers\\chromedriver.exe").toString();
            System.setProperty("webdriver.chrome.driver", path);
        }

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver,10);

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);


        driver.get("http://inventario.tresniveles.com/?View=Login");

        driver.manage().window().maximize();



        test17_AbrirCaja cpa = new test17_AbrirCaja ();
        cpa.flujoFront();

    }
}
