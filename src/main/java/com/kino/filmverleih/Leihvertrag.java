package com.kino.filmverleih;

import com.kino.film.Film;
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
