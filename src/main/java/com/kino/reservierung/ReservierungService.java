package com.kino.reservierung;

import com.kino.xsaal.Kategorie;
import com.kino.programm.Vorfuehrung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ReservierungService {

    private ReservierungRepository repository;
    private ApplicationEventPublisher applicationEventPublisher;

    public void reserviereZufaelligenPlatz(Vorfuehrung vorfuehrung, Kategorie kategorie) {
        // get all free sitzplätze of vorführung
        // randomly select one
        // create new reservierung with it
        // return the relevant information
    }

    public void abholen(Long reservierungId) {
        ReservierungEntity reservierungEntity = repository.findById(reservierungId);
        reservierungEntity.setAbgeholt(true);
        Reservierung reservierung = fromEntity(repository.save(reservierungEntity));
        applicationEventPublisher.publishEvent(reservierung);
    }

    public Reservierung read(Long id) {
        return fromEntity(repository.findById(id));
    }

    public void update(Reservierung reservierung) {
        repository.save(toEntity(reservierung));
    }

    public void create(Reservierung reservierung) {
        repository.save(toEntity(reservierung));
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    private Reservierung fromEntity(ReservierungEntity entity) {
        // mapping code hier rein
        return null;
    }

    private ReservierungEntity toEntity(Reservierung reservierung) {
        // mapping code hier rein
        return null;
    }
}
