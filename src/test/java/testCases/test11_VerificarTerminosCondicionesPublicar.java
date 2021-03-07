package testCases;

import org.testng.annotations.Test;
import page.Publicar;

public class test11_VerificarTerminosCondicionesPublicar {
    @Test
    public void test11_VerificarTermCondiciones() throws InterruptedException {
        Publicar publicar = new Publicar();
        publicar.verificarTerminosCondiciones();
    }
}
