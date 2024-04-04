package org.unrn;

import org.unrn.registro.RegInscripciones;

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
