package org.unrn.ejercicio1;

import org.unrn.ejercicio1.registro.RegInscripciones;

public class MockRegInscripciones implements RegInscripciones {
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
