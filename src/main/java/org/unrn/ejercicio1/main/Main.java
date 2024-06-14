package org.unrn.ejercicio1.main;

import org.unrn.ejercicio1.app.Concurso;
import org.unrn.ejercicio1.mail.Emisor;
import org.unrn.ejercicio1.mail.EmisorDeMail;
import org.unrn.ejercicio1.registro.RegEnDisco;
import org.unrn.ejercicio1.registro.RegInscripciones;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RegInscripciones regInsc = new RegEnDisco();
        Emisor emisor = new EmisorDeMail();
        Concurso c = new Concurso("Concurso 1",
                LocalDate.now().minusDays(1),
                LocalDate.now().plusDays(10),
                regInsc, emisor);

        // Borrar archivo si existe
        regInsc.vaciar("output.txt");

        c.inscribirParticipante("Juan", LocalDate.now());
        c.inscribirParticipante("Lucas", LocalDate.now().minusDays(1));
    }
}
