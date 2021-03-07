package page;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BotonPublicar {
    WebDriver driver;
    Conexion conexion = new Conexion();
    public BotonPublicar() {}

    @FindBy(xpath = "//span[contains(text(),'Publicar aviso')]")
    private WebElement btnpublicarAviso;

    public void existeBotonPublicarAviso() throws InterruptedException {
        conexion.conectar("www.yapo.cl");
        Thread.sleep(2000);
        if(btnpublicarAviso.isDisplayed()){
            System.out.println("Se visualiza el botón Publicar Aviso correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el botón Publicar Aviso correctamente");
            Assert.assertTrue(false);
        }
    }
}
