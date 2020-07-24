package com.kino.reservierung.server;

import com.kino.reservierung.business.ReservierungEntity;
import com.kino.reservierung.business.ReservierungRepository;

public class JdbcReservierungRepository implements ReservierungRepository {

    public ReservierungEntity findById(Long id) {
        return new ReservierungEntity();
    }

    public ReservierungEntity save(ReservierungEntity reservierung) {
        return new ReservierungEntity();
    }
}
