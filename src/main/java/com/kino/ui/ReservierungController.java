package com.kino.ui;

import com.kino.reservierung.Reservierung;
import com.kino.reservierung.ReservierungService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservierungen")
class ReservierungController {

    private ReservierungService reservierungService;

    @PutMapping("/{reservierungId}/abholung")
    ResponseEntity<HttpStatus> abholen(@PathVariable Long reservierungId) {
//        abholenDirectMethod(reservierungId);
        return ResponseEntity.ok().build();
    }

}
