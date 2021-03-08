package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page.AgregoNuevoUsuario;
import page.Login;

public class test18_AgregarUsuarioEasySystem {
    public test18_AgregarUsuarioEasySystem() {
    }

    @Test
    public void agregarNuevoUsuario() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Login login=new Login();
        login.loginEasySystem();
        AgregoNuevoUsuario agregoNuevoUsuario= new AgregoNuevoUsuario();
        agregoNuevoUsuario.agregarNuevoUsuario();
    }
}
