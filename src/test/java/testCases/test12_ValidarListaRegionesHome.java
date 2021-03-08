package testCases;

import org.testng.annotations.Test;
import page.ListaRegiones;

public class test12_ValidarListaRegionesHome {

    public test12_ValidarListaRegionesHome() {
    }

    @Test
    public void test12() throws InterruptedException {
        ListaRegiones listaRegiones = new ListaRegiones();
        listaRegiones.existenRegiones();
    }
}
