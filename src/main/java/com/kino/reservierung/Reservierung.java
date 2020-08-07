package com.kino.reservierung;

import com.kino.xsaal.Sitzreihe;
import com.kino.programm.Vorfuehrung;
import lombok.Data;
import lombok.Setter;
import lombok.Value;

@Data // this is bad practice and is only here to demonstrate bad practice
public class Reservierung {

    private Long id;
    private Vorfuehrung vorfuehrung;
    private Sitzreihe sitzreihe;
    private Integer nummer;
    private boolean abgeholt;
}
