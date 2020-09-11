package com.kino.reservierung;

import com.kino.saal.Sitzreihe;
import com.kino.programm.Vorfuehrung;
import lombok.Data;

@Data // this is bad practice and is only here to demonstrate bad practice
public class Reservierung {

    private Long id;
    private Vorfuehrung vorfuehrung;
    private Sitzreihe sitzreihe;
    private Integer nummer;
    private boolean abgeholt;
}
