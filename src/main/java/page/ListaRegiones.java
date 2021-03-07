package page;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ListaRegiones {
    WebDriver driver;
    Conexion conexion = new Conexion();
    public ListaRegiones(){ }

    @FindBy(name = "region-links")
    private WebElement listaRegiones;

    public void existenRegiones() throws InterruptedException {
        conexion.conectar("www.yapo.cl");
        Thread.sleep(2000);
        if(listaRegiones.isDisplayed()){
            System.out.println("Se visualiza la lista de regiones correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza la lista de regiones correctamente");
            Assert.assertTrue(false);
        }
    }
}
