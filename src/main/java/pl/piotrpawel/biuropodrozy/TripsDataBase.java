package pl.piotrpawel.biuropodrozy;

import pl.piotrpawel.biuropodrozy.config.TripType;

import java.time.LocalDate;

public class TripsDataBase {


    public static Trip trip_1 = new Trip("Szczecin-Goleniów", "Kraków-Balice",
            LocalDate.now(), LocalDate.now().plusDays(7), 7, TripType.AI,
            90,60, false,2,1);

    public static Trip trip_2 = new Trip("Szczecin-Goleniów", "Berlin-Schoenefeld",
            LocalDate.now(), LocalDate.now().plusDays(7), 7, TripType.AI,
            120, 100, false, 2, 1);

    public static Trip trip_3 = new Trip("Szczecin-Goleniów", "Moskwa-Szeremetiewo",
            LocalDate.now(), LocalDate.now().plusDays(7), 7, TripType.AI,
            100, 80, false, 2, 1);
}
