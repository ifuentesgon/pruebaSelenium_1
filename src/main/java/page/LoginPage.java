package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.esperarElemento;


public class LoginPage {
    //Atributos
    private WebDriver driver;
    //private WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
    private WebElement cuadroLogin;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
    private WebElement btnIngresar;

    public void validaModalLogin(){
        System.out.println("Se encontro cuadro de login");
    }

    public void ingresaUser(String nombre){
        userName.sendKeys(nombre);
        System.out.println("Se ingreso nombre usuaio correctamente");
    }

    public void ingresaPass(String pass){
        password.sendKeys(pass);
        System.out.println("Se ingreso password usuaio correctamente");
    }

    public void clickIngresar(){

        btnIngresar.click();
    }





    //Objeto cuadro de login
    /*By txtBuscar = By.xpath("/html/body/div[2]/div/div/div/div/div[2]");

    public void validaModalLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[1]")));
        if(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]")).isDisplayed()){
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]")).click();
        }
    }

    public void ingresaUser(){
        //declaración de un elemento web
        WebElement webElementBuscar = driver.findElement(txtBuscar);

        //llamada a la función sendkeys del elemento web la cual envia una combinación de caracteres
        webElementBuscar.sendKeys("audifonos");

        wait.until(
                ExpectedConditions.presenceOfElementLocated
                        (By.xpath("/html[1]/body[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[8]"))).click();
    }

    public void ingresaPass(){
        //declaración de un elemento web
        WebElement webElementBuscar = driver.findElement(txtBuscar);

        //llamada a la función sendkeys del elemento web la cual envia una combinación de caracteres
        webElementBuscar.sendKeys("audifonos");

        wait.until(
                ExpectedConditions.presenceOfElementLocated
                        (By.xpath("/html[1]/body[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[8]"))).click();
    }

    public void clickIngresar(){
        WebElement btnCerrarPopUp = wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("#acc-alert-close"))));
        if(btnCerrarPopUp.isDisplayed()){
            btnCerrarPopUp.click();
        }
        By filtroBose = By.xpath("//span[contains(text(),'bose')]");
        wait.until(ExpectedConditions.elementToBeClickable(filtroBose)).click();

    }*/






}
