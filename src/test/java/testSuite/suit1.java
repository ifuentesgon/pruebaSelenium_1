package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import testCases.test17_AbrirCaja;
import testCases.test18_AgregarUsuarioEasySystem;

import java.nio.file.Paths;

public class suit1 {

    private WebDriver driver;
    private WebDriverWait wait;
    private test17_AbrirCaja cpa;


    By usernameLogin = By.id("username");
    By paswordLogin = By.id("password");
    By btnIngresar = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");

    @BeforeTest
    public void setUP(){
        String path = Paths.get(System.getProperty("user.dir"),"/src/main/resources/drivers/chromedriver").toString();
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
         cpa = new test17_AbrirCaja(driver);

    }

    @BeforeMethod
    public void prepararPrueba (){

        driver.manage().window().maximize();
        driver.get("http://inventario.tresniveles.com/?View=Login");
    }

    @Test
    public void login() throws InterruptedException {
        //     Thread.sleep(20000);
//        driver.findElement(usernameLogin).sendKeys("admin");
//        driver.findElement(paswordLogin).sendKeys("admin");
//        driver.findElement(btnIngresar).click();
        cpa.flujoFront();
    }
}
