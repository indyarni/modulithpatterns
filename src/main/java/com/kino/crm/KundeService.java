package com.kino.crm;

import com.kino.email.EmailService;
import com.kino.export.ExportService;
import org.springframework.stereotype.Service;

@Service
public class KundeService {

    EmailService emailService;

    // adds illegal dependency leading to a cycle
    private ExportService exportService;

    public String export(Long kundeId) {
        return "";
    }

    public void registrieren() {
        emailService.sendMail("");
    }


}
