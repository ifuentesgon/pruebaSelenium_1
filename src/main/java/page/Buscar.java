package page;

import com.sun.org.apache.xerces.internal.util.Status;
import org.testng.Assert;
import libreria.Conexion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;




public class Buscar {
    //Atributos
    Conexion conexion= new Conexion();
    WebDriver driver;
    WebDriverWait wait;

    public Buscar() {
    }
    /* -------Menu Lateral Izquierdo------------------------------------------------*/
    @FindBy(id = "region_name_15")
    private WebElement regionMetropolitana;

    @FindBy(xpath= "//label[contains(text(),'Buscar por palabra clave')]")
    private WebElement tituloBuscarPalabra;

    @FindBy(id= "searchtext")
    private WebElement txtIngresoPalabra;

    @FindBy(xpath= "//label[contains(text(),'Filtrar por región')]")
    private WebElement tituloFiltroRegion;

    @FindBy(id= "searcharea_expanded")
    private WebElement cboSeleccionaRegion;

    @FindBy(id= "multicom-head")
    private WebElement cboSeleccionComuna;

    @FindBy(xpath= "//label[contains(text(),'Filtrar por categoría')]")
    private WebElement tituloFiltrarCategoria;

    @FindBy(id= "catgroup")
    private WebElement cboSeleccionCategoria;

    @FindBy(id= "searchbutton")
    private WebElement botonBuscar;
    /* ---------------------------------------------------------------------------*/


    public void validaMenuLateral(){
        if (regionMetropolitana.isDisplayed()) {
            System.out.print("Se visualiza correctamente Seleccion de Region");
            Assert.assertTrue(false);
        } else {
            System.out.print("No Se visualiza correctamente Seleccion de Region");
           Assert.assertTrue(true);
        }
        if (tituloBuscarPalabra.isDisplayed()){
            System.out.print("Se visualiza correctamente el Titulo Buscar por palabra clave");
            Assert.assertTrue(false);
        }else{
            System.out.print("No Se visualiza correctamente el Titulo Buscar por palabra clave");
            Assert.assertTrue(true  );
        }
        if (txtIngresoPalabra.isDisplayed()){
            System.out.print("Se visualiza correctamente la caja de texto de ingreso de palabra clave");
            Assert.assertTrue(false);
        }else{
            System.out.print("No Se visualiza correctamente la caja de texto de ingreso de palabra clave");
            Assert.assertTrue(true);
        }
        if (tituloFiltroRegion.isDisplayed()){
            System.out.print("Se visualiza correctamente Titulo Filtro Por Region");
            Assert.assertTrue(false);
            //addStep("Validar Vista 1 de carrucel",false, Status.PASSED,false);

        }else{
            System.out.print("No Se visualiza correctamente Titulo Filtro Por Region");
            Assert.assertTrue(true  );
            //addStep("Validar Vista 1 de carrucel",true, Status.FAILED,true);
        }
        if (cboSeleccionaRegion.isDisplayed()){
            System.out.print("Se visualiza correctamente combobox, seleccione una Region");
            Assert.assertTrue(false);
            // addStep("Validar Vista 1 de carrucel",false, Status.PASSED,false);
        }else{
            System.out.print("No Se visualiza correctamente combobox, seleccione una Region");
            Assert.assertTrue(true);
            //addStep("Validar Vista 1 de carrucel",true, Status.FAILED,true);
        }
        if (cboSeleccionComuna.isDisplayed()){
            System.out.print("Se visualiza correctamente combobox, seleccione una Comuna");
            Assert.assertTrue(false);
            // addStep("Validar Vista 1 de carrucel",false, Status.PASSED,false);
        }else{
            System.out.print("No Se visualiza correctamente combobox, seleccione una Comuna");
            Assert.assertTrue(true);
            //addStep("Validar Vista 1 de carrucel",true, Status.FAILED,true);
        }
        if (tituloFiltrarCategoria.isDisplayed()){
            System.out.print("Se visualiza correctamente Titulo Filtran Por Categoria");
            Assert.assertTrue(false);
            // addStep("Validar Vista 1 de carrucel",false, Status.PASSED,false);
        }else{
            System.out.print("No Se visualiza correctamente Titulo Filtran Por Categoria");
            Assert.assertTrue(true);
            //addStep("Validar Vista 1 de carrucel",true, Status.FAILED,true);
        }
        if (cboSeleccionCategoria.isDisplayed()){
            System.out.print("Se visualiza correctamente Combobox selecciona una Categoria");
            Assert.assertTrue(false);
            // addStep("Validar Vista 1 de carrucel",false, Status.PASSED,false);
        }else{
            System.out.print("No Se visualiza correctamente Combobox selecciona una Categoria");
            Assert.assertTrue(true);
            //addStep("Validar Vista 1 de carrucel",true, Status.FAILED,true);
        }
        if (botonBuscar.isDisplayed()){
            System.out.print("Se visualiza correctamente Boton Buscar");
            Assert.assertTrue(false);
            // addStep("Validar Vista 1 de carrucel",false, Status.PASSED,false);
        }else{
            System.out.print("No Se visualiza correctamente Boton Buscar");
            Assert.assertTrue(true);
            //addStep("Validar Vista 1 de carrucel",true, Status.FAILED,true);
        }
    }

    public void BuscarAutomovilToyota(){
        conexion.conectar("www.yapo.cl");
        validaMenuLateral();
        // valido que exista la region metropolitana y si existe le doy click
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.valueOf(regionMetropolitana))));
        if(driver.findElement(By.xpath(String.valueOf(regionMetropolitana))).isDisplayed()){
            driver.findElement(By.xpath(String.valueOf(regionMetropolitana))).click();
        }
        //Escribir en Buscador Auto Toyota
        txtIngresoPalabra.sendKeys("auto toyota yaris");
        botonBuscar.click();

    }

    public void buscarEmpleo(){
        conexion.conectar("www.yapo.cl");
        validaMenuLateral();
        // valido que exista seleccion de categoria
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.valueOf(cboSeleccionCategoria))));
        if(driver.findElement(By.xpath(String.valueOf(cboSeleccionCategoria))).isDisplayed()){
            driver.findElement(By.xpath(String.valueOf(cboSeleccionCategoria))).click();
            WebElement selectElement = driver.findElement(By.id(String.valueOf(cboSeleccionCategoria)));
            Select selectObject = new Select(selectElement);
            selectObject.selectByVisibleText("Ofertas de empleo");
        }
        botonBuscar.click();
    }
    public void buscarServicios(){
        conexion.conectar("www.yapo.cl");
        validaMenuLateral();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.valueOf(cboSeleccionCategoria))));
        if(driver.findElement(By.xpath(String.valueOf(cboSeleccionCategoria))).isDisplayed()){
            driver.findElement(By.xpath(String.valueOf(cboSeleccionCategoria))).click();
            WebElement selectElement = driver.findElement(By.id(String.valueOf(cboSeleccionCategoria)));
            Select selectObject = new Select(selectElement);
            selectObject.selectByVisibleText("Servicios");
        }
    }

}
