package de.indyarni.modulithpatterns.reservierung;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservierungen")
public class ReservierungController {

    private ReservierungService reservierungService;

    @PutMapping("/{reservierungId}/abholung")
    public ResponseEntity<Reservierung> getReservierung(@PathVariable Long reservierungId) {
        return ResponseEntity.ok(reservierungService.abholen(reservierungId));
    }

}
