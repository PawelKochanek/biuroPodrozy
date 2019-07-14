package pl.piotrpawel.biuropodrozy.DTOBulider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrpawel.biuropodrozy.Country;
import pl.piotrpawel.biuropodrozy.DTO.TripDTO;
import pl.piotrpawel.biuropodrozy.Trip;
import pl.piotrpawel.biuropodrozy.repository.CountryRepository;

import java.util.Optional;

@Service
public class TripToTripDTOBuilder {
    @Autowired
    private CountryRepository<Country> countryRepository;

    public TripDTO tripDTO (Trip trip){
        return TripDTO.builder()
                .id(trip.getId())
                .countryId(Optional.ofNullable(trip.getStartCountry()).map(x -> x.getId()).orElse(null))
                .countryId(Optional.ofNullable(trip.getDestinationCountry()).map(x -> x.getId()).orElse(null))
                .dateTravelFrom(trip.getDateTravelFrom())
                .dateTravelTo(trip.getDateTravelTo())
                .daysNumber(trip.getDaysNumber())
                .tripType(trip.getTripType())
                .priceForAdult(trip.getPriceForAdult())
                .priceForChild(trip.getPriceForChild())
                .isPromoted(trip.getIsPromoted())
                .howManyAdultsAreTraveling(trip.getHowManyAdultsAreTraveling())
                .howManyAdultsAreTraveling(trip.getHowManyChildrenAreTraveling())
                .build();
    }

    public Trip buildEntity(TripDTO dto){
        Trip trip = new Trip();

        trip.setStartCountry(Optional.ofNullable(dto.getCountryId()).map(countryRepository::getOne).orElse(null));
        trip.setDestinationCountry(Optional.ofNullable(dto.getCountryId()).map(countryRepository::getOne).orElse(null));
        trip.setDateTravelFrom(dto.getDateTravelFrom());
        trip.setDateTravelTo(dto.getDateTravelTo());
        trip.setDaysNumber(dto.getDaysNumber());
        trip.setTripType(dto.getTripType());
        trip.setPriceForAdult(dto.getPriceForAdult());
        trip.setPriceForChild(dto.getPriceForChild());
        trip.setIsPromoted(dto.getIsPromoted());
        trip.setHowManyAdultsAreTraveling(dto.getHowManyAdultsAreTraveling());
        trip.setHowManyChildrenAreTraveling(dto.getHowManyChildrenAreTraveling());
        return trip;
    }
}
