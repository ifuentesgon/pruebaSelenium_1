package testCases;

import org.testng.annotations.Test;
import page.Tecnico;

public class test19_AgregarTecnicoEasySystem {
    public test19_AgregarTecnicoEasySystem() {
    }

    String nomTecnico = "Técnico en Santiago";
    String telefono = "12345678";
    @Test
    public void test19() throws InterruptedException {
        Tecnico tecnico = new Tecnico();
        tecnico.agregarTecnico(nomTecnico, telefono);
    }
}
