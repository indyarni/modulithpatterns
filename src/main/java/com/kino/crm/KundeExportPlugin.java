package com.kino.crm;

import com.kino.export.ExportPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KundeExportPlugin implements ExportPlugin {

    @Autowired
    KundeService kundeService;

    public String export(Long kundeId) {
        Kunde kunde = kundeService.findById(kundeId);
        return kunde.getName() + kunde.getTelefonnummer();
    }
}
