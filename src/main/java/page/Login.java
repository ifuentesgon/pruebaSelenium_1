package page;

import libreria.Conexion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.util.concurrent.TimeUnit;

import static utils.Utils.esperarElemento;


public class Login {
    Conexion conexion = new Conexion();
    WebDriver driver; //= new ChromeDriver();
    WebDriverWait wait;
    public Login(){
    }


    /*----------Objetos de Page Yapo.cl--------------- */
    @FindBy(xpath = "//*[@id=\'login-account-link\']")
    private WebElement btnInicioSesion;
    @FindBy(name = "accbar_email")
    private WebElement ingresoCorreo;
    @FindBy(name = "accbar_password")
    private WebElement ingresoPass;
    @FindBy(id= "acc_login_submit_button")
    private WebElement btningresar;
    /*------------------------------------------------*/
    //Perteneciente a Yapo
    public void modalLogin(String username, String password) throws InterruptedException {
        Thread.sleep(500);
        conexion.conectar("www.yapo.cl");
        Thread.sleep(500);
        btnInicioSesion.submit();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        ingresoCorreo.sendKeys(username);
        ingresoPass.sendKeys(password);

        btningresar.click();
    }


    /*----------Objetos de Page Easy System--------------- */
    //By txtUsuario = By.id("username");
    By txtPassword = By.id("password");
    By botonIngresar = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]");

    @FindBy(name= "username")
    private WebElement txtUsuario;


     /*----------------------------------------------------*/

    public void loginEasySystem()throws InterruptedException{
        String usuario= "admin";
        String password= "admin";
        conexion.conectar("http://inventario.tresniveles.com/?View=Login");
        PageFactory.initElements(driver,this);

        //Ingreso usuario en caja de texto correspondiente
        //WebElement webElementUsuario = driver.findElement(txtUsuario);
        //webElementUsuario.sendKeys((CharSequence) usuario);
        if (esperarElemento(txtUsuario, 10)) {
            txtUsuario.sendKeys(usuario);
        }else{
            System.out.println(txtUsuario + "Vacio");
        }

       //Ingreso Password en caja de texto correspondiente
       WebElement webElementPassword = driver.findElement(txtPassword);
       webElementPassword.sendKeys((CharSequence) password);

     //Doy click en Ingresar al sistema
        wait.until(ExpectedConditions.elementToBeClickable(botonIngresar)).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
