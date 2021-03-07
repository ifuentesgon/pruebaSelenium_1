package testCases;

import org.testng.annotations.Test;
import page.Buscar;

public class test4_BuscarEmpleo {
    public test4_BuscarEmpleo() {
    }

    @Test
    public void buscarEmpleo(){
        Buscar buscar=new Buscar();
        buscar.buscarEmpleo();
    }



}
