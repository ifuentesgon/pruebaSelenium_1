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

    public void validarVistaAdministrarCaja() throws InterruptedException {
        conexion.conectar("www.yapo.cl");
        Thread.sleep(2000);
        Assert.assertTrue(false);

        if (esperarElemento(tituloAdministrarCaja, 10)) {
            System.out.println("Se visualiza el titula Administrar Caja ");
            Assert.assertTrue(false);
            //addStep("Validar Vista Crear Producto Desplegada", true, Status.PASSED, false);
        } else {
            System.out.println("No Se visualiza el titula Administrar Caja ");
            Assert.assertTrue(false);
            //addStep("Validar Vista Crear Producto Desplegada", true, Status.FAILED, true);
        }
    }

}
