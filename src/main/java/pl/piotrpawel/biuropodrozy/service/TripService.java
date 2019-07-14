package pl.piotrpawel.biuropodrozy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrpawel.biuropodrozy.Country;
import pl.piotrpawel.biuropodrozy.Trip;
import pl.piotrpawel.biuropodrozy.DTO.TripDTO;
import pl.piotrpawel.biuropodrozy.DTOBulider.TripToTripDTOBuilder;
import pl.piotrpawel.biuropodrozy.config.TripType;
import pl.piotrpawel.biuropodrozy.repository.TripRepository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TripService {

@Autowired
    private TripRepository<Trip> tripRepository;
@Autowired
    private TripToTripDTOBuilder tripToTripDTOBuilder;




public void addTrip (Country startCountryName, Country destinationCountryName, LocalDate dateTravelFrom, LocalDate dateTravelTo, int daysNumber,
                     TripType tripType, int howManyAdultsAreTraveling, int howManyChildrenAreTraveling, long priceForChild, long priceForAdult, boolean isPromoted){


    Trip trip = new Trip();

    trip.setDateTravelFrom(dateTravelFrom);
    trip.setDateTravelTo(dateTravelTo);
    trip.setStartCountry(startCountryName);
    trip.setDestinationCountry(destinationCountryName);
    trip.setDaysNumber(daysNumber);
    trip.setHowManyAdultsAreTraveling(howManyAdultsAreTraveling);
    trip.setHowManyChildrenAreTraveling(howManyChildrenAreTraveling);
    trip.setTripType(tripType);
    trip.setPriceForChild(priceForChild);
    trip.setPriceForAdult(priceForAdult);
    trip.setIsPromoted(isPromoted);
    tripRepository.save(trip);
    }

    public void updateTrip(TripDTO tripDTO) {
    Trip trip = tripToTripDTOBuilder.buildEntity(tripDTO);
    tripRepository.save(trip);
    }

    public Optional<Trip> findById(Long id) {
        return tripRepository.findCountryById(id);
    }

    public List<Trip> findAll() {
        return tripRepository.findAll();
    }






    @PostConstruct
    private void mockTrips(){
addTrip(new Country("Germany"), new Country("Phiipines"), LocalDate.now(), LocalDate.now().plusDays(7), 7,
        TripType.AI, 2, 1, 1000, 2000, false );
addTrip(new Country ("Poland"), new Country("Dominicana"), LocalDate.now(), LocalDate.now().plusDays(8), 8,
        TripType.AI, 1, 0, 800, 1600, false );
addTrip(new Country("Russia"), new Country("Georgia"), LocalDate.now(), LocalDate.now().plusDays(10), 10,
        TripType.HB, 3, 0, 500, 1000, true );
    }
}

