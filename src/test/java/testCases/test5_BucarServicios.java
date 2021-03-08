package testCases;

import org.testng.annotations.Test;
import page.Buscar;

public class test5_BucarServicios {
    public test5_BucarServicios() {
    }
@Test
    public void buscarServicios(){
        Buscar buscar=new Buscar();
        buscar.buscarServicios();
    }

}
