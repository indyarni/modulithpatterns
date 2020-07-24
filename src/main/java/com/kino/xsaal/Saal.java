package com.kino.xsaal;

import lombok.Value;

import java.util.List;

@Value
public class Saal {

    private String bezeichnung;

    private List<Sitzreihe> sitzReihen;

    Integer getAnzahlSitze() {
        return sitzReihen.stream().mapToInt(reihe -> reihe.getAnzahlSitze()).sum();
    }
}
