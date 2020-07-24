package com.kino.xsaal;

import lombok.Value;

@Value
public class Sitzreihe {
    private String bezeichnung;
    private Kategorie kategorie;
    private Integer anzahlSitze;
}
