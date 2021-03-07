package testCases;

import org.testng.annotations.Test;
import page.BotonPublicar;

public class test8_VerificarBotonPublicar {
    @Test
    public void test8() throws InterruptedException {
        BotonPublicar botonPublicar = new BotonPublicar();
        botonPublicar.existeBotonPublicarAviso();
    }
}
