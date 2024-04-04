package org.unrn;

import org.unrn.mail.Emisor;

public class MockEmisor implements Emisor {
    @Override
    public void enviarMail(String texto) {
        System.out.println("Email enviado satisfactoriamente");
    }
}
