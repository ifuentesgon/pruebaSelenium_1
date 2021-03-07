package page;

import libreria.Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministrarCajaPage {

    WebDriver driver;
    Conexion conexion = new Conexion();
    public AdministrarCajaPage() {}

    @FindBy(id = "rut")
    private WebElement txtuserName;


}
