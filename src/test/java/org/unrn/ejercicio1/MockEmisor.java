package org.unrn.ejercicio1;

import org.unrn.ejercicio1.mail.Emisor;

public class MockEmisor implements Emisor {
    @Override
    public void enviarMail(String texto) {
        System.out.println("Email enviado satisfactoriamente");
    }
}
