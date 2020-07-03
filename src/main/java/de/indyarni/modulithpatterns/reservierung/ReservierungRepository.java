package de.indyarni.modulithpatterns.reservierung;

import org.springframework.data.jpa.repository.JpaRepository;

interface ReservierungRepository extends JpaRepository<ReservierungEntity, Long> {
}
