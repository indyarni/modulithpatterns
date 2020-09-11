package com.kino.gutschein;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GutscheinEntity {

    public Long id;

    public String gutscheinCode;

    public Integer betrag;

    public LocalDateTime erstellungsZeitpunkt;

    public LocalDate gueltigBis;

    public LocalDateTime einloeseZeitpunkt;
}
