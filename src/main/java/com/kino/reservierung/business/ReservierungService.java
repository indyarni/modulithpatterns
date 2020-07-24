package com.kino.reservierung.business;

import com.kino.reservierung.server.JdbcReservierungRepository;
import com.kino.saal.Kategorie;
import com.kino.programm.Vorfuehrung;
import org.springframework.stereotype.Service;

@Service
public class ReservierungService {

    private JdbcReservierungRepository repository;

    public void reserviereZufaelligenPlatz(Vorfuehrung vorfuehrung, Kategorie kategorie) {
        // get all free sitzplätze of vorführung
        // randomly select one
        // create new reservierung with it
        // return the relevant information
    }

    public Reservierung abholen(Long reservierungId) {
        ReservierungEntity reservierungEntity = repository.findById(reservierungId);
        reservierungEntity.setAbgeholt(true);
        return fromEntity(repository.save(reservierungEntity));
    }

    private Reservierung fromEntity(ReservierungEntity entity) {
        // mapping code hier rein
        return null;
    }
}
