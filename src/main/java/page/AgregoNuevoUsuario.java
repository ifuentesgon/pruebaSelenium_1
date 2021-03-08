package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static utils.Utils.esperarElemento;

public class AgregoNuevoUsuario {
    private WebDriverWait wait;
    private WebDriver driver;


    public AgregoNuevoUsuario() {
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[13]/a[1]")
    private WebElement cboUsuario;

    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[13]/ul[1]/li[2]/a[1]")
    private WebElement Usuario;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/h5[1]")
    private WebElement tituloUsuarioSistema;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[1]")
    private WebElement botonAgregaNuevo;

    @FindBy(xpath = "//span[contains(text(),'Ingresar Usuario')]")
    private WebElement tituloIngresarUsuario;

    @FindBy(id = "select2-cbEmpleado-container")
    private WebElement cboIngresaEmpleado;

    @FindBy(id = "txtUser")
    private WebElement txtUsuario;

    @FindBy(id="txtPassword")
    private WebElement txtPassword;

    @FindBy(id="select2-cbTipo-container")
    private WebElement cboTipoUsuario;

    @FindBy(id="btnGuardar")
    private  WebElement botonGuardar;

    @FindBy(id="reset")
    private  WebElement botonCerrar;

    public void agregarNuevoUsuario(){
        Login login= new Login();
        //Click en Boton que despliega Empleados y Usuarios
        if (esperarElemento(cboUsuario, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(cboUsuario)).click();
            cboUsuario.click();
            System.out.println("Se realiza Click en despligue Usuarios");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible realizar Click en despligue Usuarios");
            Assert.assertTrue(true );
        }

        // Selecciono Opcion Usuarios
        if (esperarElemento(Usuario, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(Usuario)).click();
            Usuario.click();
            System.out.println("Se realiza Click en Opcion Usuarios");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible realizar Click en Opcion Usuarios");
            Assert.assertTrue(true );
        }

        //visualizo Titulo Ingrsar Usuario
        if (tituloIngresarUsuario.isDisplayed()){
            System.out.print("Se visualiza correctamente combobox, seleccione una Comuna");
            Assert.assertTrue(false);
        }
        else{
            System.out.print("No Se visualiza correctamente combobox, seleccione una Comuna");
            Assert.assertTrue(true);
            //addStep("Validar Vista 1 de carrucel",true, Status.FAILED,true);
        }

        //Click en Boton Agregar Nuevo
        if (esperarElemento(botonAgregaNuevo, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(botonAgregaNuevo)).click();
            botonAgregaNuevo.click();
            System.out.println("Se realiza Click Boton Agregar Nuevo");
            Assert.assertTrue(true  );
        }
        else {
            System.out.println("No es  Posible realizar Click en Opcion Usuarios");
            Assert.assertTrue(false );
        }

        //Selecciono Empleado agregado
        if (esperarElemento(cboIngresaEmpleado, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(cboIngresaEmpleado)).click();
            WebElement selectElement = driver.findElement(By.id(String.valueOf(cboIngresaEmpleado)));
            Select selectObject = new Select(selectElement);
            selectObject.selectByVisibleText("JOSE MIGUEL RONGO");
            System.out.println("Se realiza Seleccion de Empleado ingresado");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible realizar Click en Opcion Usuarios");
            Assert.assertTrue(true );
        }

        //Ingresa Usuario
        if (esperarElemento(txtUsuario, 10)){
            txtUsuario.sendKeys("usuario1");
            System.out.println("Se ingresa name Usuario");
            Assert.assertTrue(true  );
        }
        else {
            System.out.println("No es  Posible ingresar Usuario");
            Assert.assertTrue(false );
        }

        //Ingresa Password
        if (esperarElemento(txtPassword, 10)){
            txtPassword.sendKeys("usuario1");
            System.out.println("Se ingresa name Usuario");
            Assert.assertTrue(true  );
        }
        else {
            System.out.println("No es  Posible ingresar Usuario");
            Assert.assertTrue(false );
        }

        //Selecciona tipo Usuario
        if (esperarElemento(cboTipoUsuario, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(cboTipoUsuario)).click();
            WebElement selectElement = driver.findElement(By.id(String.valueOf(cboTipoUsuario)));
            Select selectObject = new Select(selectElement);
            selectObject.selectByVisibleText("CAJERO/A");
            System.out.println("Se realiza Seleccion de Empleado ingresado");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible realizar Click en Opcion Usuarios");
            Assert.assertTrue(true );
        }

        //Boton Guardar
        if (esperarElemento(botonGuardar, 10)){
            botonGuardar.click();
            System.out.println("Se Guarda Correctamente lo ingresaro");
            Assert.assertTrue(true  );
        }
        else {
            System.out.println("No es  Posible Guardar");
            Assert.assertTrue(false );
        }

    }




}
