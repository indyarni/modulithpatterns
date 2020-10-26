package com.kino.auditlog;

import com.kino.reservierung.ReservierungAbgeholtEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ReservierungAbgeholtEventListener implements ApplicationListener<ReservierungAbgeholtEvent> {

    AuditLogService auditLogService;

    @Override
    public void onApplicationEvent(ReservierungAbgeholtEvent reservierungAbgeholtEvent) {
        auditLogService.createLogEntry(reservierungAbgeholtEvent.getMessage());
    }
}
