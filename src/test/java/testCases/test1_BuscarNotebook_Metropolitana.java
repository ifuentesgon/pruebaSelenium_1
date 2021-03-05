package testCases;


import libreria.Conexion;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test1_BuscarNotebook_Metropolitana {

    Conexion conexion = new Conexion();

    @Test
    public void test1() {
        //Conexión Falabella
        conexion.conectar();

    }
}
