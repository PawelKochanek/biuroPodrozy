package pl.piotrpawel.biuropodrozy;

import lombok.Getter;
import lombok.Setter;
import pl.piotrpawel.biuropodrozy.config.TripType;

import java.time.LocalDate;

@Getter @Setter
public class Trip {

    String travelFrom; // miasto, lotnisko
    String travelTo; // miasto, hotel, lotnisko
    LocalDate dateTravelFrom; // data wyjazdu
    LocalDate dateTravelTo; // data powrotu
    int daysNumber; // ilość dni
    TripType tripType; // stworzony Enum z kategoriami
    long priceForAdult; // cena za doroslego
    long priceForChild; // cena za dziecko
    boolean isPromoted; // czy wycieczka jest promowana?
    int howManyAdultsAreTraveling; // ilosc podrozujacych doroslych
    int howManyChildrenAreTraveling; // ilosc podrozojacych dzieci

    public Trip() {}

    public Trip(String travelFrom, String travelTo, LocalDate dateTravelFrom,
                LocalDate dateTravelTo, int daysNumber, TripType tripType,
                long priceForAdult, long priceForChild, boolean isPromoted,
                int howManyAdultsAreTraveling, int howManyChildrenAreTraveling) {
        this.travelFrom = travelFrom;
        this.travelTo = travelTo;
        this.dateTravelFrom = dateTravelFrom;
        this.dateTravelTo = dateTravelTo;
        this.daysNumber = daysNumber;
        this.tripType = tripType;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.isPromoted = isPromoted;
        this.howManyAdultsAreTraveling = howManyAdultsAreTraveling;
        this.howManyChildrenAreTraveling = howManyChildrenAreTraveling;
    }
}
