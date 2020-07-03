package de.indyarni.modulithpatterns.vorfuehrung;

import de.indyarni.modulithpatterns.film.Film;
import de.indyarni.modulithpatterns.saal.Saal;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Vorfuehrung {

    private Film film;
    private Saal saal;
    private LocalDateTime zeitpunkt;
}
