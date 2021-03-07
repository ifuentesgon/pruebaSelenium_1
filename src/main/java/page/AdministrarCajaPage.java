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

    @FindBy(xpath = "//strong[contains(text(),'Opciones')]")
    private WebElement btnOpciones;

    @FindBy(css = "body.has-detached-right.pace-done:nth-child(4) div.page-container:nth-child(3) div.page-content div.content-wrapper div.content div.panel.panel-flat div.panel-heading:nth-child(2) div.heading-elements div.btn-group.heading-btn.open ul.dropdown-menu.dropdown-menu-right li:nth-child(1) > a:nth-child(1)")
    private WebElement btnAbrirCaja;

    @FindBy(id = "txtCantidad")
    private WebElement txtCantidad;

    @FindBy(id = "btnGuardar")
    private WebElement btnGuardar;

    public void validarVistaAdministrarCaja() {
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

    public void ingresaMontoAbrirCaja(String monto){
        if (esperarElemento(txtCantidad, 10)){
            txtCantidad.sendKeys(monto);
            System.out.println("Se agrego monto correctamente");
        }
        else {
            System.out.println("NO Se agrego monto correctamente");

        }

    }

    public void clickBtnLateralCaja(){

        btnMenuLateralCaja.click();
    }

    public void clickBtnLateralAdministrarCaja(){

        btnMenuLateralAdministrarCaja.click();
    }

    public void clickBtnOpciones(){

        btnOpciones.click();
    }

    public void clickBtnAbrirCaja(){

        btnAbrirCaja.click();
    }

    public void clickBtnGuardar(){

        btnGuardar.click();
    }

}
