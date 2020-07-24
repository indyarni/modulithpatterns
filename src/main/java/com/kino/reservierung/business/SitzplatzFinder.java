package com.kino.reservierung.business;

import com.kino.saal.Kategorie;
import com.kino.saal.Sitzreihe;
import com.kino.programm.Vorfuehrung;

import java.util.HashMap;
import java.util.Map;

// Das ist zusätzlicher Business Code zum Business Service. In manchen Modulen ist die Business Logik so komplex, dass sie über mehrere Klassen verteilt werden muss.
class SitzplatzFinder {
    Map<Sitzreihe, Integer> findeFreieSitzplaetze(Vorfuehrung vorfuehrung, Kategorie kategorie, Integer anzahl) {
        // Algorithmus zum ermitteln freier Sitzplätze anhand der Eigenschaften
        // des Saals, der gewünschten Anzahl und Kategorie und der bisherigen Reservierungen
        return new HashMap<>();
    }
}
