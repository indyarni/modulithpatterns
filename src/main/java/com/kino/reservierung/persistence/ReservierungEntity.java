package com.kino.reservierung.persistence;

import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ReservierungEntity {

    @Id
    private Long id;
    private Long vorfuehrungId;
    private Long sitzreiheId;
    private Integer nummer;
    private boolean abgeholt;
}
