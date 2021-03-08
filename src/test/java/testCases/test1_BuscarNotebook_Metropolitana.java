package testCases;


import org.testng.annotations.Test;
import page.Login;

public class test1_BuscarNotebook_Metropolitana {
    public test1_BuscarNotebook_Metropolitana() {
    }

    String correo = "nafugo@gmail.com";
    String pass = "nacho1716";

    @Test
    public void test1() throws InterruptedException {
        Login login = new Login();
        login.modalLogin(correo,pass);

    }
}
