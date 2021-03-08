package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static utils.Utils.esperarElemento;

public class AgregaProductoNuevo {
    private WebDriverWait wait;
    private WebDriver driver;
    public AgregaProductoNuevo() {
    }

    public AgregaProductoNuevo(WebElement menuLateralAlmacen, WebElement producto,
                               WebElement tituloProducto, WebElement botonAgregaProducto,
                               WebElement botonImprimir, WebElement tituloIngresarProducto,
                               WebElement textIngresoProducto, WebElement txtCantStock,
                               WebElement txtPrecioCompra, WebElement txtPrecio1,
                               WebElement txtprecio2, WebElement txtprecio3,
                               WebElement txtStockMin, WebElement cboSelectCategoria,
                               WebElement cboSelectMarca, WebElement cboSelectPresentacion,
                               WebElement switchInventariable, WebElement btnGuardar1) {
        this.menuLateralAlmacen = menuLateralAlmacen;
        this.producto = producto;
        this.tituloProducto = tituloProducto;
        this.botonAgregaProducto = botonAgregaProducto;
        this.botonImprimir = botonImprimir;
        this.textIngresoProducto = textIngresoProducto;
        this.txtCantStock = txtCantStock;
        this.txtPrecioCompra = txtPrecioCompra;
        this.txtPrecio1 = txtPrecio1;
        this.txtprecio2 = txtprecio2;
        this.txtprecio3 = txtprecio3;
        this.txtStockMin = txtStockMin;
        this.cboSelectCategoria = cboSelectCategoria;
        this.cboSelectMarca = cboSelectMarca;
        this.cboSelectPresentacion = cboSelectPresentacion;
        this.switchInventariable = switchInventariable;
        this.btnGuardar = btnGuardar1;
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
    private WebElement menuLateralAlmacen;
    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[4]/a[1]")
    private WebElement producto;
    @FindBy(xpath = "//h5[contains(text(),'Productos')]")
    private WebElement tituloProducto;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")
    private WebElement botonAgregaProducto;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement botonImprimir;
    @FindBy(id = "txtProducto")
    private WebElement textIngresoProducto;
    @FindBy(id = "txtStock")
    private WebElement txtCantStock;
    @FindBy(id = "txtPCompra")
    private WebElement txtPrecioCompra;
    @FindBy(id = "txtPVenta")
    private WebElement txtPrecio1;
    @FindBy(id = "txtPVentaM")
    private WebElement txtprecio2;
    @FindBy(id = "txtPVenta3")
    private WebElement txtprecio3;
    @FindBy(id = "txtSMin")
    private WebElement txtStockMin;
    @FindBy(id = "select2-cbCategoria-container")
    private WebElement cboSelectCategoria;
    @FindBy(id = "select2-cbMarca-container")
    private WebElement cboSelectMarca;
    @FindBy(id = "select2-cbPresentacion-container")
    private WebElement cboSelectPresentacion;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[3]/div[1]/label[1]/span[1]")
    private WebElement switchInventariable;
    @FindBy(id = "btnGuardar")
    private WebElement btnGuardar;

    public void agregarProductos() throws InterruptedException {
        Login login = new Login();
        login.loginEasySystem();

        //Click en Menu Lateral Almacen
        if (esperarElemento(menuLateralAlmacen, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(menuLateralAlmacen)).click();
            menuLateralAlmacen.click();
            System.out.println("Se realiza Click en Menu Lateral Izquierdo ALMACEN");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible realizar Click en despligue Usuarios");
            Assert.assertFalse(true );
        }
        //Click en Menu Perteneciente Almacen Opcion Productos
        if (esperarElemento(producto, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(producto)).click();
            producto.click();
            System.out.println("Se realiza Click en Menu Lateral Izquierdo ALMACEN");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible realizar Click en despligue Usuarios");
            Assert.assertFalse(true );
        }
        //visualizo Titulo Productos
        if (tituloProducto.isDisplayed()){
            System.out.print("Se visualiza correctamente Titulo Productos del PopUP");
            Assert.assertTrue(false);
        }
        else{
            System.out.print("No Se visualiza correctamente combobox, seleccione una Comuna");
            Assert.assertFalse(true);
        }
        //Click en Menu Perteneciente Almacen Opcion Productos
        if (esperarElemento(botonAgregaProducto, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(botonAgregaProducto)).click();
            botonAgregaProducto.click();
            System.out.println("Se realiza Click en Boton Agregar Producto");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No Se Pudo realiza Click en Boton Agregar Producto\"");
            Assert.assertFalse(true );
        }
        //Ingresa un Nuevo producto
        if (esperarElemento(textIngresoProducto, 10)){
            textIngresoProducto.sendKeys("Bebida Cola");
            System.out.println("Se ingresa nuevo producto");
            Assert.assertTrue(true  );
        }
        else {
            System.out.println("No es  Posible ingresar producto");
            Assert.assertFalse(true);
        }
        //Ingresa cantidad de Stock
        if (esperarElemento(txtCantStock, 10)){
            textIngresoProducto.sendKeys("100");
            System.out.println("Se ingresa Cantidad de Stock");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible ingresar Cantidad de Stock");
            Assert.assertFalse(true);
        }
        //Ingresa Precio Compra
        if (esperarElemento(txtPrecioCompra, 10)){
            textIngresoProducto.sendKeys("100");
            System.out.println("Se ingresa Precio de Compra");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible ingresar Precio de Compra");
            Assert.assertFalse(true);
        }
        //Ingresa Precio Compra uno
        if (esperarElemento(txtPrecio1, 10)){
            textIngresoProducto.sendKeys("500");
            System.out.println("Se ingresa Precio de Compra 1");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible ingresar Precio de Compra 1");
            Assert.assertFalse(true);
        }
        //Ingresa Precio Compra dos
        if (esperarElemento(txtprecio2, 10)){
            textIngresoProducto.sendKeys("3500");
            System.out.println("Se ingresa Precio de Compra 2");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible ingresar Precio de Compra 2");
            Assert.assertFalse(true);
        }
        //Ingresa Precio Compra tres
        if (esperarElemento(txtprecio3, 10)){
            textIngresoProducto.sendKeys("200");
            System.out.println("Se ingresa Precio de Compra 3");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible ingresar Precio de Compra 3");
            Assert.assertFalse(true);
        }
        //Ingresa Precio Compra tres
        if (esperarElemento(txtStockMin, 10)){
            textIngresoProducto.sendKeys("2");
            System.out.println("Se ingresa Stock Minimo");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible ingresar Stock Minimo");
            Assert.assertFalse(true);
        }
        //Selecciono Empleado agregado
        if (esperarElemento(cboSelectCategoria, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(cboSelectCategoria)).click();
            WebElement selectElement = driver.findElement(By.id(String.valueOf(cboSelectCategoria)));
            Select selectObject = new Select(selectElement);
            selectObject.selectByVisibleText("BEBIDAS");
            System.out.println("Se realiza Seleccion de Categoria");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No es  Posible realizar Seleccion de Categoria");
            Assert.assertTrue(true );
        }


        //Click en Final Imprimir
        if (esperarElemento(botonImprimir, 10)){
            wait.until(ExpectedConditions.elementToBeClickable(botonImprimir)).click();
            botonImprimir.click();
            System.out.println("Se realiza Click en Boton Agregar Producto");
            Assert.assertTrue(false  );
        }
        else {
            System.out.println("No Se Pudo realiza Click en Boton Agregar Producto\"");
            Assert.assertFalse(true );
        }


    }

}
