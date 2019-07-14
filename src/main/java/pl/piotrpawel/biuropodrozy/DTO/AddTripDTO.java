package pl.piotrpawel.biuropodrozy.DTO;


import lombok.*;
import pl.piotrpawel.biuropodrozy.config.TripType;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Pattern;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddTripDTO {

    @NotBlank(message = "Pole musi zostać wypełnione")
    private String startCountry;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private String destinationCountry;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private LocalDate travelFrom;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private LocalDate travelTo;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private TripType tripType;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private Long priceForAdult;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private Long priceForChild;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private Boolean isPromoted;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private int howManyAdultsAreTraveling;
    @NotBlank(message = "Pole musi zostać wypełnione")
    private int howManyChildrenAreTraveling;



}
