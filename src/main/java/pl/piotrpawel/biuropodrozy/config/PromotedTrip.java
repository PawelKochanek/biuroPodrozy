package pl.piotrpawel.biuropodrozy.config;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class PromotedTrip {


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















}
