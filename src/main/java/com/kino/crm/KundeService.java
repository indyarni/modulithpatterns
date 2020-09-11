package com.kino.crm;

import org.springframework.stereotype.Service;

@Service
public class KundeService {

    public Kunde findById(Long kundeId) {
        return new Kunde();
    }

    public String export(Long kundeId) {
        return "";
    }
}
