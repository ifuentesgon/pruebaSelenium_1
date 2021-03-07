package page;

import libreria.Conexion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BuscarArriendo {
    WebDriver driver;
    Conexion conexion = new Conexion();
    public BuscarArriendo(){ }

    @FindBy(id = "region_name_15")
    private WebElement regionMetropolitana;

    @FindBy(id = "searchtext")
    private WebElement ingresoBusqueda;

    //@FindBy(id="searcharea_expanded")
    //private WebElement filtroRegion;

    //@FindBy(id = "catgroup" )
    //private WebElement filtroCategoria;

    @FindBy(xpath = "//span[contains(text(),'Buscar')]")
    private WebElement botonBuscar;

    public void busquedaArriendoVacaciones(String textBusqueda) throws InterruptedException {
        conexion.conectar();
        Thread.sleep(2000);
        regionMetropolitana.click();
        ingresoBusqueda.sendKeys(textBusqueda);
        //filtroRegion.click();
        Select regionPais = new Select (driver.findElement(By.xpath("//select[@id='searcharea_expanded']")));
        regionPais.selectByVisibleText("Chile");
        //filtroCategoria.click();
        Select categoria = new Select(driver.findElement(By.id("catgroup")));
        categoria.selectByVisibleText("Arriendo de temporada");
        botonBuscar.click();
    }



}




