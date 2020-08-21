package com.kino.reservierung;

import com.kino.programm.Vorfuehrung;
import com.kino.programm.VorfuehrungEntity;
import lombok.Data;
import lombok.Value;

import javax.persistence.*;


@Entity
class ReservierungEntity {

    @Id
    private Long id;
    @ManyToOne
    private VorfuehrungEntity vorfuehrung;
    private Long sitzreihe;
    private Integer nummer;
    private boolean abgeholt;

    public VorfuehrungEntity getVorfuehrung() {
        return vorfuehrung;
    }

    public void setVorfuehrung(VorfuehrungEntity vorfuehrung) {
        this.vorfuehrung = vorfuehrung;
    }

    public Long getSitzreihe() {
        return sitzreihe;
    }

    public void setSitzreihe(Long sitzreihe) {
        this.sitzreihe = sitzreihe;
    }

    public Integer getNummer() {
        return nummer;
    }

    public void setNummer(Integer nummer) {
        this.nummer = nummer;
    }

    public boolean isAbgeholt() {
        return abgeholt;
    }

    public void setAbgeholt(boolean abgeholt) {
        this.abgeholt = abgeholt;
    }
}
