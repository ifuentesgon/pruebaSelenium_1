package testCases;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.AdministrarCajaPage;
import page.Login;

public class test17_AbrirCaja {

    AdministrarCajaPage administrarCajaPage = new AdministrarCajaPage();
    Login login = new Login();
    String monto = "10000";

    @Test
    public void flujoFront() throws InterruptedException {


        //login.loginEasySystem();
        administrarCajaPage.clickBtnLateralCaja();
        administrarCajaPage.clickBtnLateralAdministrarCaja();
        administrarCajaPage.validarVistaAdministrarCaja();
        administrarCajaPage.clickBtnOpciones();
        administrarCajaPage.clickBtnAbrirCaja();
        administrarCajaPage.ingresaMontoAbrirCaja(monto);
        administrarCajaPage.clickBtnGuardar();

    }
}
