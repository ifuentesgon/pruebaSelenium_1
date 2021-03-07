package testCases;

import org.testng.annotations.Test;
import page.Login;

public class test18_AgregarUsuarioEasySystem {
    public test18_AgregarUsuarioEasySystem() {
    }

    @Test
    public void agregarNuevoUsuario() throws InterruptedException {
        Login login=new Login();
        login.loginEasySystem();
    }
}
