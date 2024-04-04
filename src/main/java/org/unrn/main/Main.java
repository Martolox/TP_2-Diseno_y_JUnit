package org.unrn.main;

import org.unrn.app.Concurso;
import org.unrn.mail.Emisor;
import org.unrn.mail.EmisorDeMail;
import org.unrn.registro.RegEnDisco;
import org.unrn.registro.RegInscripciones;

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