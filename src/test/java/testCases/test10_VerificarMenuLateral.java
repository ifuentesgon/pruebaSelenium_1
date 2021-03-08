package testCases;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.Test;
import page.Buscar;

public class test10_VerificarMenuLateral {
    public test10_VerificarMenuLateral() {
    }
    @Test
    public void verificaMenuLateral(){
        Buscar buscar = new Buscar();
        buscar.validaMenuLateral();
    }

}
