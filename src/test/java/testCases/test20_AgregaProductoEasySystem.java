package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AgregaProductoNuevo;
import page.Login;

public class test20_AgregaProductoEasySystem {
    public test20_AgregaProductoEasySystem() {
    }

    public void agregaProducto() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Login login= new Login();
        login.loginEasySystem();
        AgregaProductoNuevo agregaProductoNuevo= new AgregaProductoNuevo();
        agregaProductoNuevo.agregarProductos();

    }
}
