package com.kino.reservierung.user;

import com.kino.reservierung.business.ReservierungService;
import com.kino.reservierung.business.Reservierung;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservierungen")
public class ReservierungController {

    private ReservierungService reservierungService;

    @PutMapping("/{reservierungId}/abholung")
    public ResponseEntity<Reservierung> abholen(@PathVariable Long reservierungId) {
        return ResponseEntity.ok(reservierungService.abholen(reservierungId));
    }

}
