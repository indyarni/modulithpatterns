package de.indyarni.modulithpatterns.reservierung;

import de.indyarni.modulithpatterns.vorfuehrung.Vorfuehrung;
import lombok.Value;

@Value
public class SitzplatzReservierung {

    private Vorfuehrung vorfuehrung;
    private String sitzplatz;
    private String name;
}
