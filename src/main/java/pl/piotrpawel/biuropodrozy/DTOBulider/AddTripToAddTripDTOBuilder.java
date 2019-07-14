package pl.piotrpawel.biuropodrozy.DTOBulider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrpawel.biuropodrozy.Country;
import pl.piotrpawel.biuropodrozy.DTO.AddTripDTO;
import pl.piotrpawel.biuropodrozy.DTO.TripDTO;
import pl.piotrpawel.biuropodrozy.Trip;
import pl.piotrpawel.biuropodrozy.repository.CountryRepository;
import pl.piotrpawel.biuropodrozy.service.CountryService;

import java.util.Optional;

@Service
public class AddTripToAddTripDTOBuilder {
    @Autowired
    private CountryService countryService;

    public Trip trip (AddTripDTO addTripDTO) {


        return Trip.builder()
                .startCountry(countryService.findCountryByName(addTripDTO.getStartCountry()).get())
                .destinationCountry(countryService.findCountryByName(addTripDTO.getDestinationCountry()).get())
                .dateTravelFrom(addTripDTO.getTravelFrom())
                .dateTravelTo(addTripDTO.getTravelTo())
                .tripType(addTripDTO.getTripType())
                .priceForAdult(addTripDTO.getPriceForAdult())
                .priceForChild(addTripDTO.getPriceForChild())
                .isPromoted(addTripDTO.getIsPromoted())
                .howManyAdultsAreTraveling(addTripDTO.getHowManyAdultsAreTraveling())
                .howManyAdultsAreTraveling(addTripDTO.getHowManyChildrenAreTraveling())
                .build();
    }

//    public Trip buildEntity(AddTripDTO dto) {




}
