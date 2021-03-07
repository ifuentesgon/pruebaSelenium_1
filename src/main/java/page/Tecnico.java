package page;

import libreria.Conexion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tecnico {
    WebDriver driver;
    Conexion conexion = new Conexion();
    Login login = new Login();
    public Tecnico(){ }

    By opcionTaller = By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[11]/a[1]");
    By opcionTecnicos = By.xpath("//a[contains(text(),'Tecnicos')]");
    By labelTecnicos = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/h5[1]");
    By btnAgregarNvo = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[1]");
    By labelIngresarTecnico = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/h5[1]/span[1]");
    By labelTecnico = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/label[1]");
    By txtTecnico = By.id("txtTecnico");
    By labelTelefono = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/label[1]");
    By txtTelefono = By.id("txtTelefono");
    By btnGuardar = By.id("btnGuardar");

    public void agregarTecnico(String tecnico, String telefono) throws InterruptedException {
        this.driver = new ChromeDriver();
        Login login = new Login();
        Thread.sleep(1000);
        WebElement webElementopcionTaller = driver.findElement(opcionTaller);
        if(webElementopcionTaller.isDisplayed()){
            System.out.println("Se visualiza la opción Taller correctamente");
            Assert.assertTrue(false);
            webElementopcionTaller.click();
        }else{
            System.out.println("No se visualiza la opción Taller correctamente");
        }
        WebElement webElementopcionTecnicos = driver.findElement(opcionTecnicos);
        if(webElementopcionTecnicos.isDisplayed()){
            System.out.println("Se visualiza la opción Técnicos correctamente");
            Assert.assertTrue(false);
            webElementopcionTecnicos.click();
        }else{
            System.out.println("No se visualiza la opción Tecnicos correctamente");
            Assert.assertTrue(true);
        }
        WebElement webElementlabelTecnicos = driver.findElement(labelTecnicos);
        if(webElementlabelTecnicos.isDisplayed()){
            System.out.println("Se visualiza el título Técnicos correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título Técnicos correctamente");
            Assert.assertTrue(true);
        }
        WebElement webElementbtnAgregarNvo = driver.findElement(btnAgregarNvo);
        if(webElementbtnAgregarNvo.isDisplayed()){
            System.out.println("Se visualiza el botón Agregar Nuevo correctamente");
            Assert.assertTrue(false);
            webElementbtnAgregarNvo.click();
        }else{
            System.out.println("No se visualiza el botón Agregar Nuevo correctamente");
            Assert.assertTrue(true);
        }
        WebElement webElementlabelIngresarTecnico = driver.findElement(labelIngresarTecnico);
        if(webElementlabelIngresarTecnico.isDisplayed()){
            System.out.println("Se visualiza el título Ingresar Técnico correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título Ingresar Técnico correctamente");
            Assert.assertTrue(true);
        }
        WebElement webElementlabelTecnico = driver.findElement(labelTecnico);
        if(webElementlabelTecnico.isDisplayed()){
            System.out.println("Se visualiza el título Técnico correctamente");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el título Técnico correctamente");
            Assert.assertTrue(true);
        }
        WebElement webElementxtTecnico = driver.findElement(txtTecnico);
        webElementxtTecnico.sendKeys(tecnico);
        WebElement webElementtxtTelefono = driver.findElement(txtTelefono);
        webElementtxtTelefono.sendKeys(telefono);
        WebElement webbtnGuardar = driver.findElement(btnGuardar);
        if(webbtnGuardar.isDisplayed()){
            System.out.println("Se visualiza el botón Guardar correctamente");
            Assert.assertTrue(false);
            webbtnGuardar.click();
        }else{
            System.out.println("No se visualiza el botón Guardar correctamente");
            Assert.assertTrue(true);
        }
    }

}
