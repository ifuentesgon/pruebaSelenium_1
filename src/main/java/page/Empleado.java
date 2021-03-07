package page;

import libreria.Conexion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Empleado {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait;
    Conexion conexion = new Conexion();
    public Empleado(){ }

    By opcionUsuarios = By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[13]/a[1]");
    By opcionEmpleados = By.xpath("//a[contains(text(),'Empleados')]");
    By labelEmpleados = By.className("panel-title");
    By btnAgregarNuevo = By.className("btn btn-primary heading-btn");
    By labelIngresarEmpleado = By.xpath("//span[contains(text(),'Ingresar Empleado')]");
    By labelCodigo = By.xpath("//label[contains(text(),'Codigo')]");
    By labelNombre = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/label[1]");
    By txtNombre = By.id("txtNombre");
    By labelApellido = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/label[1]");
    By txtApellido = By.id("txtApellido");
    By labelTelefono = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/label[1]");
    By txtTelefono = By.id("txtTelefono");
    By labelEmail = By.xpath("//label[contains(text(),'Email')]");
    By txtEmail = By.id("txtEmail");
    By btnGuardar = By.xpath("//button[@id='btnGuardar']");

    public void agregarEmpleado(String nombre, String apellido, String telefono, String email) throws InterruptedException {
        this.driver = new ChromeDriver();
        conexion.conectar("http://www.inventario.tresniveles.com/?View=Login");

        Thread.sleep(1000);
        WebElement webElementOpcionUsuarios = driver.findElement(opcionUsuarios);
        webElementOpcionUsuarios.click();
        WebElement webElementOpcionEmpleados = driver.findElement(opcionEmpleados);
        if(webElementOpcionEmpleados.isDisplayed()){
            System.out.println("Se visualiza la opción Empleados correctamente");
            Assert.assertTrue(false);
            webElementOpcionEmpleados.click();
        }else{
            System.out.println("No se visualiza la opción Empleados correctamente");
            Assert.assertTrue(false);
        }
        WebElement webElementTituloEmpelados = driver.findElement(labelEmpleados);
        if(webElementTituloEmpelados.isDisplayed()){
            System.out.println("Se visualiza el título de Empleados correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título de Empleados correctamente");
            Assert.assertTrue(false);
        }
        WebElement webElementBtnAgregarNuevo = driver.findElement(btnAgregarNuevo);
        webElementBtnAgregarNuevo.click();
        WebElement webElementlabelIngresarEmpleado = driver.findElement(labelIngresarEmpleado);
        if(webElementlabelIngresarEmpleado.isDisplayed()){
            System.out.println("Se visualiza el título Ingresar Empleado correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título Ingresar Empleado correctamente");
            Assert.assertTrue(false);
        }
        WebElement webElementlabelNombre = driver.findElement(labelNombre);
        if(webElementlabelNombre.isDisplayed()){
            System.out.println("Se visualiza el título Nombre correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título Nombre correctamente");
            Assert.assertTrue(false);
        }
        WebElement webElementxtNombre = driver.findElement(txtNombre);
        webElementxtNombre.sendKeys(nombre);

        WebElement webElementlabelApellido = driver.findElement(labelApellido);
        if(webElementlabelApellido.isDisplayed()){
            System.out.println("Se visualiza el título Apellido correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título Apellido correctamente");
            Assert.assertTrue(false);
        }
        WebElement webElementxtApellido = driver.findElement(txtApellido);
        webElementxtApellido.sendKeys(apellido);

        WebElement webElementlabelTelefono = driver.findElement(labelTelefono);
        if(webElementlabelTelefono.isDisplayed()){
            System.out.println("Se visualiza el título Teléfono correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título Teléfono correctamente");
            Assert.assertTrue(false);
        }
        WebElement webElementxtTelefono = driver.findElement(txtTelefono);
        webElementxtTelefono.sendKeys(telefono);

        WebElement webElementlabelEmail = driver.findElement(labelEmail);
        if(webElementlabelEmail.isDisplayed()){
            System.out.println("Se visualiza el título Email correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título Email correctamente");
            Assert.assertTrue(false);
        }
        WebElement webElementxtEmail = driver.findElement(txtEmail);
        webElementxtEmail.sendKeys(email);
        WebElement webElementbtnGuardar = driver.findElement(btnGuardar);
        webElementbtnGuardar.click();
    }

}
