package testCases;

import org.testng.annotations.Test;
import page.Empleado;

public class test16_AgregarEmpleado {
    String nombre = "John";
    String apellido = "Doe";
    String telefono = "12345678";
    String email = "johndoe@gmail.com";

    @Test
    public void test16() throws InterruptedException {
        Empleado empleado = new Empleado();
        empleado.agregarEmpleado(nombre, apellido, telefono, email);
    }
}
