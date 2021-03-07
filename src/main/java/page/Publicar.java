package page;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Publicar {
    WebDriver driver;
    Conexion conexion = new Conexion();
    public Publicar() {}

    @FindBy(xpath = "//span[contains(text(),'Publicar aviso')]")
    private WebElement btnPublicarAviso;

    @FindBy(className = "link_use_terms")
    private WebElement terminosYcondicones;

    public void verificarTerminosCondiciones() throws InterruptedException {
        conexion.conectar("www.yapo.cl");
        Thread.sleep(2000);
        btnPublicarAviso.click();
        if(terminosYcondicones.isDisplayed()){
            System.out.println("Se visualiza el link de términos y condiciones");
            Assert.assertTrue(false);
        }else{
            System.out.println("No se visualiza el link de términos y condiciones");
            Assert.assertTrue(false);
        }

    }
}
