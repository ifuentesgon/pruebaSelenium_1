package testCases;

import org.omg.CORBA.PUBLIC_MEMBER;
import page.Buscar;

public class test10_VerificarMenuLateral {
    public test10_VerificarMenuLateral() {
    }
    public void verificaMenuLateral(){
        Buscar buscar = new Buscar();
        buscar.validaMenuLateral();
    }

}
