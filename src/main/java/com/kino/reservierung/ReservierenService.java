package com.kino.reservierung;

import com.kino.saal.Kategorie;
import com.kino.programm.Vorfuehrung;
import org.springframework.stereotype.Service;

@Service
public class ReservierenService {

    private ReservationDb repository;

    public void reserviereZufaelligenPlatz(Vorfuehrung vorfuehrung, Kategorie kategorie) {
        // get all free sitzplätze of vorführung
        // randomly select one
        // create new reservierung with it
        // return the relevant information
    }

    public SitzplatzReservierung abholen(Long reservierungId) {
        DbReservierung dbReservierung = repository.findById(reservierungId);
        dbReservierung.setAbgeholt(true);
        return fromEntity(repository.save(dbReservierung));
    }

    public SitzplatzReservierung fromEntity(DbReservierung entity) {
        // mapping code hier rein
        return null;
    }
}
