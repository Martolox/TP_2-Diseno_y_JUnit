package org.unrn.ejercicio2.main;

import org.unrn.ejercicio2.app.Mesa;
import org.unrn.ejercicio2.registros.RegCobros;
import org.unrn.ejercicio2.registros.RegEnDisco;
import org.unrn.ejercicio2.tarjetas.Visa;

public class Main {
    public static void main(String[] args) {
        Mesa mesa;
        RegCobros regCobros = new RegEnDisco();

        // Borrar archivo si existe
        regCobros.vaciar("output.txt");

        mesa = new Mesa(regCobros);
        mesa.crearPedido("Plato1", "Bebida1");
        mesa.crearPedido("Plato2", "Bebida2");
        mesa.crearPedido("Plato3", "Bebida3");
        mesa.crearPedido("Plato1", "Bebida3");

        Visa visa = new Visa();
//        assertEquals(80.3046,
//                mesa.cobrar(visa, Mesa.Propina.DOS),
//                0.001);
    }
}
