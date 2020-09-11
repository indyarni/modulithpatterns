package com.kino.export;

import com.kino.crm.KundeService;
import com.kino.reservierung.ReservierungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExportService {

    @Autowired
    ReservierungService reservierungService;

    @Autowired
    KundeService kundeService;

    public String export(Long kundeId) {
        String kundenExport = kundeService.export(kundeId);
        String reservierungsExport = reservierungService.export(kundeId);
        return kundenExport + reservierungsExport;
    }
}
