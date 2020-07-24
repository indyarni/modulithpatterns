package com.kino.reservierung;

import com.kino.saal.Sitzreihe;
import com.kino.programm.Vorfuehrung;
import lombok.Value;

@Value
public class Reservierung {

    private Long id;
    private Vorfuehrung vorfuehrung;
    private Sitzreihe sitzreihe;
    private Integer nummer;
    private boolean abgeholt;
}
