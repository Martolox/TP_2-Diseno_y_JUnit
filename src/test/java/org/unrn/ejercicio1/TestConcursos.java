package org.unrn.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unrn.ejercicio1.app.Concurso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

public class TestConcursos {

    private final MockRegInscripciones regInsc = new MockRegInscripciones();
    private final MockEmisor emisor = new MockEmisor();
    private final Concurso c = new Concurso("Concurso 1",
            LocalDate.now().minusDays(1),
            LocalDate.now().plusDays(10),
            regInsc, emisor);

    @BeforeEach
    public void borrarArchivo() {
        regInsc.vaciar("output.txt");
    }

    @Test
    public void participanteSeInscribe() {
        assertFalse(c.isParticipante("Pedro"));
        c.inscribirParticipante("Pedro", LocalDate.now());
        verificarParticipanteInscripcionYPuntaje();
        verificarRegistroInscripciones();
    }

    private void verificarParticipanteInscripcionYPuntaje() {
        assertTrue(c.isParticipante("Pedro"));
        assertTrue(c.isInscripcion("Pedro", LocalDate.now()));
        assertFalse(c.isInscripcion("Javier", LocalDate.now()));
        assertEquals(0, c.getPuntaje("Pedro"));
    }

    private void verificarRegistroInscripciones() {
        String texto = (LocalDate.now().
                format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        texto += ", Pedro, Concurso 1\n";
        assertEquals(texto, regInsc.getTexto());
    }

    @Test
    public void participanteSeInscribeElPrimerDia() {
        assertEquals(-1, c.getPuntaje("Marcos"));
        c.inscribirParticipante("Marcos", LocalDate.now().minusDays(1));
        assertEquals(10, c.getPuntaje("Marcos"));
    }

    @Test
    public void participanteSeInscribeFueraDeRango() {
        assertThrows(RuntimeException.class, () ->
                c.inscribirParticipante("Juan", LocalDate.now().minusDays(2)));
    }
}
