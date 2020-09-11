package com.kino.programm;

import com.kino.saal.Saal;
import com.kino.film.Film;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Vorfuehrung {

    private Film film;
    private Saal saal;
    private LocalDateTime zeitpunkt;
}
