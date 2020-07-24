package com.kino.reservierung.business;

public interface ReservierungRepository {

    ReservierungEntity findById(Long id);

    ReservierungEntity save(ReservierungEntity reservierung);
}
