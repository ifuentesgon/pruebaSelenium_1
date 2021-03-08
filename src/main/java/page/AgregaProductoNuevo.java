package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgregaProductoNuevo {
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

}
