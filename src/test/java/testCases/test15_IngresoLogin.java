package testCases;

import org.testng.annotations.Test;
import page.Login;

public class test15_IngresoLogin {
    public test15_IngresoLogin() {
    }
    String correo = "nafugo@gmail.com";
    String pass = "nacho1716";
    @Test
    public void ingresoLogin() throws InterruptedException {
        Login login= new Login();
        login.modalLogin(correo,pass);
    }

}
