package pl.piotrpawel.biuropodrozy;


import pl.piotrpawel.biuropodrozy.config.TripType;

import java.time.LocalDate;

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

    public String getTravelFrom() {
        return travelFrom;
    }

    public void setTravelFrom(String travelFrom) {
        this.travelFrom = travelFrom;
    }

    public String getTravelTo() {
        return travelTo;
    }

    public void setTravelTo(String travelTo) {
        this.travelTo = travelTo;
    }

    public LocalDate getDateTravelFrom() {
        return dateTravelFrom;
    }

    public void setDateTravelFrom(LocalDate dateTravelFrom) {
        this.dateTravelFrom = dateTravelFrom;
    }

    public LocalDate getDateTravelTo() {
        return dateTravelTo;
    }

    public void setDateTravelTo(LocalDate dateTravelTo) {
        this.dateTravelTo = dateTravelTo;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public void setDaysNumber(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public long getPriceForAdult() {
        return priceForAdult;
    }

    public void setPriceForAdult(long priceForAdult) {
        this.priceForAdult = priceForAdult;
    }

    public long getPriceForChild() {
        return priceForChild;
    }

    public void setPriceForChild(long priceForChild) {
        this.priceForChild = priceForChild;
    }

    public boolean isPromoted() {
        return isPromoted;
    }

    public void setPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    public int getHowManyAdultsAreTraveling() {
        return howManyAdultsAreTraveling;
    }

    public void setHowManyAdultsAreTraveling(int howManyAdultsAreTraveling) {
        this.howManyAdultsAreTraveling = howManyAdultsAreTraveling;
    }

    public int getHowManyChildrenAreTraveling() {
        return howManyChildrenAreTraveling;
    }

    public void setHowManyChildrenAreTraveling(int howManyChildrenAreTraveling) {
        this.howManyChildrenAreTraveling = howManyChildrenAreTraveling;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "travelFrom='" + travelFrom + '\'' +
                ", travelTo='" + travelTo + '\'' +
                ", dateTravelFrom=" + dateTravelFrom +
                ", dateTravelTo=" + dateTravelTo +
                ", daysNumber=" + daysNumber +
                ", tripType=" + tripType +
                ", priceForAdult=" + priceForAdult +
                ", priceForChild=" + priceForChild +
                ", isPromoted=" + isPromoted +
                ", howManyAdultsAreTraveling=" + howManyAdultsAreTraveling +
                ", howManyChildrenAreTraveling=" + howManyChildrenAreTraveling +
                '}';
    }
}
