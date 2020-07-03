package de.indyarni.modulithpatterns.saal;

import lombok.Value;

@Value
public class Sitzreihe {
    private String bezeichnung;
    private Kategorie kategorie;
    private Integer anzahlSitze;
}
