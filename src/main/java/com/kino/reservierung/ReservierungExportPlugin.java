package com.kino.reservierung;

import com.kino.export.ExportPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservierungExportPlugin implements ExportPlugin {

    @Autowired
    ReservierungService reservierungService;

    @Override
    public String export(Long kundeId) {
        Reservierung reservierung = reservierungService.findByKundeId(kundeId);
        return reservierung.getNummer() + reservierung.getVorfuehrung().toString();

    }
}
