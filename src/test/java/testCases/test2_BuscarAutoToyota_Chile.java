package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page.Buscar;

public class test2_BuscarAutoToyota_Chile {
    //Constructor vacio
    public test2_BuscarAutoToyota_Chile() {
    }
    WebDriver driver = new ChromeDriver();

    @Test
    public void buscarAutoToyota(){
        Buscar buscar=new Buscar();
        buscar.BuscarAutomovilToyota();
    }


}
