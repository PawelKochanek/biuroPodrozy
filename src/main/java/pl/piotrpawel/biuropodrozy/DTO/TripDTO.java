package pl.piotrpawel.biuropodrozy.DTO;

import lombok.*;
import pl.piotrpawel.biuropodrozy.config.TripType;

import java.time.LocalDate;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TripDTO {

    private Long id;
    private Long countryId;
    private LocalDate dateTravelFrom;
    private LocalDate dateTravelTo;
    private int daysNumber;
    private TripType tripType;
    private long priceForAdult;
    private long priceForChild;
    private Boolean isPromoted;
    private int howManyAdultsAreTraveling;
    private int howManyChildrenAreTraveling;
}
