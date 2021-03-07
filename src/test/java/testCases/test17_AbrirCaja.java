package testCases;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.AdministrarCajaPage;
import page.Login;
import page.LoginPage;

public class test17_AbrirCaja {

    AdministrarCajaPage administrarCajaPage = new AdministrarCajaPage();
    LoginPage loginPage = new LoginPage();
    String monto = "10000";
    String nombre = "admin";
    String pass = "admin";

    public void flujoFront() {


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
