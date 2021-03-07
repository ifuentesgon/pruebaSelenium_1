package testCases;

import org.testng.annotations.Test;
import page.BuscarArriendo;
import page.Login;

public class test3_BuscarArriendoVacaciones {

    String busqueda = "arriendo vacaciones";

    @Test
    public void test3() throws InterruptedException {
        BuscarArriendo buscarArriendo = new BuscarArriendo();
        buscarArriendo.busquedaArriendoVacaciones(busqueda);
    }
}
