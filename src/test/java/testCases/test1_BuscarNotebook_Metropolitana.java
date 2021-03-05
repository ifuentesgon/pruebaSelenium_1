package testCases;


import libreria.Conexion;
import org.testng.annotations.Test;

public class test1_BuscarNotebook_Metropolitana {

    Conexion conexion = new Conexion();

    @Test
    public void test1() {
        //Conexión Falabella
        conexion.conectar();


    }
}
