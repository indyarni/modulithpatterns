package com.kino.reservierung;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservierungen")
public class ReservierungClientService {

    private ReservierenService reservierenService;

    @PutMapping("/{reservierungId}/abholung")
    public ResponseEntity<SitzplatzReservierung> abholen(@PathVariable Long reservierungId) {
        return ResponseEntity.ok(reservierenService.abholen(reservierungId));
    }

}
