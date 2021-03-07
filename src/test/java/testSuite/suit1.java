package testSuite;

import org.testng.annotations.Test;
import testCases.test17_AbrirCaja;

public class suit1 {

    @Test(priority = 1, description = "Caso 1: Abrir Caja")
    public void test17_AbrirCaja(){
        test17_AbrirCaja cpa = new test17_AbrirCaja ();
        cpa.flujoFront();

    }
}
