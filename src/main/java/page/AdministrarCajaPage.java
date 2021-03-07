package page;

import libreria.Conexion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static utils.Utils.esperarElemento;


public class AdministrarCajaPage {

    Conexion conexion = new Conexion();

    public AdministrarCajaPage() {}

    @FindBy(xpath = "//span[contains(text(),'Caja')]")
    private WebElement btnMenuLateralCaja;

    @FindBy(xpath = "//a[contains(text(),'Administrar Caja')]")
    private WebElement btnMenuLateralAdministrarCaja;

    @FindBy(xpath = "//li[contains(text(),'Administrar Caja - Movimientos de Caja')]")
    private WebElement tituloAdministrarCaja;

    public void validarVistaAdministrarCaja() {
        conexion.conectar("www.yapo.cl");
        Thread.sleep(2000);
        Assert.assertTrue(false);

        if(tituloAdministrarCaja.isDisplayed()){
            System.out.println("Se visualiza el botón Publicar Aviso correctamente");
            Assert.assertTrue(false);
        }else
        {
            System.out.println("No se visualiza el botón Publicar Aviso correctamente");
            Assert.assertTrue(false);
        }
    }

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
