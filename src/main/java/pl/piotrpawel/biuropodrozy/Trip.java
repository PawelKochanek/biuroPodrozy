package pl.piotrpawel.biuropodrozy;


import lombok.*;
import pl.piotrpawel.biuropodrozy.config.TripType;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter @Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Trip extends BaseEntity{

    @ManyToOne
    private Country startCountry; // kraj
    @ManyToOne
    private Country destinationCountry; // kraj
    private LocalDate dateTravelFrom; // data wyjazdu
    private LocalDate dateTravelTo; // data powrotu
    private int daysNumber; // ilość dni
    private TripType tripType; // stworzony Enum z kategoriami
    private long priceForAdult; // cena za doroslego
    private long priceForChild; // cena za dziecko
    private Boolean isPromoted; // czy wycieczka jest promowana?
    private int howManyAdultsAreTraveling; // ilosc podrozujacych doroslych
    private int howManyChildrenAreTraveling; // ilosc podrozojacych dzieci
}
