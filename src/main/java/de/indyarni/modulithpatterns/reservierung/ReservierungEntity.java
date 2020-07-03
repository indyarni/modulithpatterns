package de.indyarni.modulithpatterns.reservierung;

import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
class ReservierungEntity {

    @Id
    private Long id;
    private Long vorfuehrungId;
    private Long sitzreiheId;
    private Integer nummer;
    private boolean abgeholt;
}
