package testCases;

import org.testng.annotations.Test;
import page.Buscar;

public class test2_BuscarAutoToyota_Chile {
    //Constructor vacio
    public test2_BuscarAutoToyota_Chile() {
    }

    @Test
    public void buscarAutoToyota(){
        Buscar buscar=new Buscar();
        buscar.BuscarAutomovilToyota();
    }


}
