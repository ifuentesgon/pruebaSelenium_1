package testCases;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.AdministrarCajaPage;
import page.LoginPage;

public class test17_AbrirCaja {
    public test17_AbrirCaja() {
    }
    String monto = "10000";
    String nombre = "admin";
    String pass = "admin";

    @Test
    public void flujoFront() {
        AdministrarCajaPage administrarCajaPage = new AdministrarCajaPage();
        LoginPage loginPage = new LoginPage();
        loginPage.validaModalLogin();
        loginPage.ingresaUser(nombre);
        loginPage.ingresaPass(pass);
        loginPage.clickIngresar();
        administrarCajaPage.clickBtnLateralCaja();
        administrarCajaPage.clickBtnLateralAdministrarCaja();
        administrarCajaPage.validarVistaAdministrarCaja();
        administrarCajaPage.clickBtnOpciones();
        administrarCajaPage.clickBtnAbrirCaja();
        administrarCajaPage.ingresaMontoAbrirCaja(monto);
        administrarCajaPage.clickBtnGuardar();

    }
}
