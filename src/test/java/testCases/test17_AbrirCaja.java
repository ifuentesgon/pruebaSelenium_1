package testCases;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.AdministrarCajaPage;
import page.Login;

public class test17_AbrirCaja {

    AdministrarCajaPage caja = new AdministrarCajaPage();
    Login login = new Login();
    Conexion conexion = new Conexion();
    WebDriver driver;
    WebDriverWait wait;

    String monto = "10000";
    String url = "http://inventario.tresniveles.com/?View=Login";


    public void flujoFront(){

        //login.loginEasySystem();
        caja.clickBtnLateralCaja();
        caja.clickBtnLateralAdministrarCaja();
        caja.validarVistaAdministrarCaja();
        caja.clickBtnOpciones();
        caja.clickBtnAbrirCaja();
        caja.ingresaMontoAbrirCaja(monto);
        caja.clickBtnGuardar();


    }
}