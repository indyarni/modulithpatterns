package com.kino.reservierung;

import com.kino.email.EmailService;
import com.kino.saal.Kategorie;
import com.kino.programm.Vorfuehrung;
import org.springframework.stereotype.Service;

@Service
public class ReservierungService {

    private ReservierungRepository repository;

    private EmailService emailService;

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
        emailService.sendMail("Reservierung " + reservierung.toString() + "wurde abgeholt.");
    }

    public String export(Long kundeId) {
        ReservierungEntity reservierung = repository.findByKundeId(kundeId);
        return reservierung.getNummer() + reservierung.getVorfuehrung().toString();
    }

    private Reservierung fromEntity(ReservierungEntity entity) {
        // mapping code hier rein
        return null;
    }
}
