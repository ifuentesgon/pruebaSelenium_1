package testCases;


import org.openqa.selenium.WebDriver;
import page.AdministrarCajaPage;
import page.LoginPage;

public class test17_AbrirCaja {
    private WebDriver driver;
    //AdministrarCajaPage administrarCajaPage = new AdministrarCajaPage();

    public test17_AbrirCaja(WebDriver driver) {
        this.driver = driver;

    }
    String monto = "10000";
    String nombre = "admin";
    String pass = "admin";

    public void flujoFront() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.validaModalLogin();
        loginPage.ingresaUser(nombre);
        loginPage.ingresaPass(pass);
        loginPage.clickIngresar();
//        administrarCajaPage.clickBtnLateralCaja();
//        administrarCajaPage.clickBtnLateralAdministrarCaja();
//        administrarCajaPage.validarVistaAdministrarCaja();
//        administrarCajaPage.clickBtnOpciones();
//        administrarCajaPage.clickBtnAbrirCaja();
//        administrarCajaPage.ingresaMontoAbrirCaja(monto);
//        administrarCajaPage.clickBtnGuardar();

    }
}
