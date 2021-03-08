package testCases;


import page.AdministrarCajaPage;
import page.LoginPage;

public class test17_AbrirCaja {
    //AdministrarCajaPage administrarCajaPage = new AdministrarCajaPage();
    public test17_AbrirCaja() {
    }
    String monto = "10000";
    String nombre = "admin";
    String pass = "admin";

    public void flujoFront() {

        LoginPage loginPage = new LoginPage();
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
