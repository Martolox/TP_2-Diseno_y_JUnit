package org.unrn.ejercicio2;

import org.unrn.ejercicio2.registros.RegCobros;

public class MockRegCobros implements RegCobros {
    public String texto;

    public String getTexto() {
        return texto;
    }

    public void guardar(String texto) {
        this.texto = texto;
    }

    public void vaciar(String nomArchivo) {
    }
}
