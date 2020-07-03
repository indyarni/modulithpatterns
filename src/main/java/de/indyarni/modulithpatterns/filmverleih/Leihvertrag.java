package de.indyarni.modulithpatterns.filmverleih;

import de.indyarni.modulithpatterns.film.Film;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Leihvertrag {

    private String verleih;
    private Film film;
    private LocalDateTime beginn;
    private LocalDateTime ende;
    private Integer anzahlVorfuehrungen;
}
