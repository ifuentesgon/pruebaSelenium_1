package page;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MenuSuperior {
    WebDriver driver;
    Conexion conexion = new Conexion();
    public MenuSuperior() {}

    @FindBy(xpath = "//span[contains(text(),'Publicar aviso')]")
    private WebElement btnpublicarAviso;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

    @FindBy(xpath = "//a[contains(text(),'Buscar Avisos')]")
    private WebElement buscarAvisos;

    @FindBy(xpath = "//a[contains(text(),'Mis favoritos')]")
    private WebElement misFavoritos;

    @FindBy(xpath = "//a[contains(text(),'Ayuda')]")
    private WebElement ayuda;

    @FindBy(xpath = "//a[contains(text(),'Mis Avisos')]")
    private WebElement misAvisos;

    @FindBy(xpath = "//a[contains(text(),'Tiendas')]")
    private WebElement tiendas;

    @FindBy(xpath = "//span[contains(text(),'Iniciar sesión')]")
    private WebElement btnIniciarSesion;

    public void verificarMenSup() throws InterruptedException {
        conexion.conectar();
        Thread.sleep(2000);
        btnpublicarAviso.click();
        Thread.sleep(2000);
        if (home.isDisplayed()) {
            System.out.println("Se visualiza el link de home correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el link de home correctamente");
            Assert.assertTrue(false);
        }

        if (buscarAvisos.isDisplayed()) {
            System.out.println("Se visualiza el link de Buscar Avisos correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el link de Buscar Avisos correctamente");
            Assert.assertTrue(false);
        }

        if (misFavoritos.isDisplayed()) {
            System.out.println("Se visualiza el link de Mis Favoritos correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el link de Mis Favoritos correctamente");
            Assert.assertTrue(false);
        }

        if (ayuda.isDisplayed()) {
            System.out.println("Se visualiza el link de Ayuda correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el link de Ayuda correctamente");
            Assert.assertTrue(false);
        }

        if (misAvisos.isDisplayed()) {
            System.out.println("Se visualiza el link de Mis Avisos correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el link de Mis Avisos correctamente");
            Assert.assertTrue(false);
        }

        if (tiendas.isDisplayed()) {
            System.out.println("Se visualiza el link de Tiendas correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el link de Tiendas correctamente");
            Assert.assertTrue(false);
        }

        if (btnIniciarSesion.isDisplayed()) {
            System.out.println("Se visualiza el botón de Iniciar Sesión correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el botón de Iniciar Sesión correctamente");
            Assert.assertTrue(false);
        }
    }
}
