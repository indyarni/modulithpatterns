package de.indyarni.modulithpatterns.reservierung;

import de.indyarni.modulithpatterns.saal.Sitzreihe;
import de.indyarni.modulithpatterns.vorfuehrung.Vorfuehrung;
import lombok.Value;

@Value
public class Reservierung {

    private Long id;
    private Vorfuehrung vorfuehrung;
    private Sitzreihe sitzreihe;
    private Integer nummer;
    private boolean abgeholt;
}
