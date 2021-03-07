package page;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Login {
    Conexion conexion = new Conexion();
    public Login(){

    }

    @FindBy(xpath = "//*[@id=\'login-account-link\']")
    private WebElement btnInicioSesion;

    @FindBy(name = "accbar_email")
    private WebElement ingresoCorreo;

    @FindBy(name = "accbar_password")
    private WebElement ingresoPass;

    @FindBy(id= "acc_login_submit_button")
    private WebElement btningresar;

    public void modalLogin(String username, String password) throws InterruptedException {
<<<<<<< HEAD

        Thread.sleep(2000);
=======
        conexion.conectar();
        Thread.sleep(20000);
>>>>>>> 6b51fa451d0a79f745d795d30cc59b23ab56ed6f
        btnInicioSesion.submit();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        ingresoCorreo.sendKeys(username);
        ingresoPass.sendKeys(password);

        btningresar.click();

    }
}
