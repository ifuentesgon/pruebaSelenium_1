package testCases;

import org.testng.annotations.Test;
import page.MenuSuperior;

public class test9_VerificarMenuSuperior {
    @Test
    public void test9() throws InterruptedException {
        MenuSuperior menuSuperior = new MenuSuperior();
        menuSuperior.verificarMenSup();
    }
}
