package com.kino.ui;

import com.kino.reservierung.Reservierung;
import com.kino.reservierung.ReservierungService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservierungen")
class ReservierungController {

    private ReservierungService reservierungService;

    @PutMapping("/{reservierungId}/abholung")
    public ResponseEntity<Reservierung> abholen(@PathVariable Long reservierungId) {
        return ResponseEntity.ok(reservierungService.abholen(reservierungId));
    }

}
