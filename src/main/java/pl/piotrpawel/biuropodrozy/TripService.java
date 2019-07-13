package pl.piotrpawel.biuropodrozy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrpawel.biuropodrozy.config.TripType;
import pl.piotrpawel.biuropodrozy.repository.TripRepository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class TripService {

@Autowired
    private TripRepository<Trip> tripRepository;
@Autowired
    private TripToTripDTOBuilder tripToTripDTOBuilder;




public void addTrip (String startCountryName, String destinationCountryName, LocalDate dateTravelFrom, LocalDate dateTravelTo, int daysNumber,
         TripType tripType, int howManyAdultsAreTraveling, int howManyChildrenAreTraveling){


    Trip trip = new Trip();

    trip.setDateTravelFrom(dateTravelFrom);
    trip.setDateTravelTo(dateTravelTo);
    trip.setStartCountry(startCountryName);
    trip.setDestinationCountry(destinationCountryName);
    trip.setDaysNumber(daysNumber);
    trip.setHowManyAdultsAreTraveling(howManyAdultsAreTraveling);
    trip.setHowManyChildrenAreTraveling(howManyChildrenAreTraveling);
    trip.setTripType(tripType);
    tripRepository.save(trip);

    }
    @PostConstruct
    private void mockTrips(){
addTrip("Germany", "Phiipines", LocalDate.now(), LocalDate.now().plusDays(7), 7,
        TripType.AI, 2, 1 );
addTrip("Poland", "Dominicana", LocalDate.now(), LocalDate.now().plusDays(8), 8,
        TripType.AI, 1, 0 );
addTrip("Russia", "Georgia", LocalDate.now(), LocalDate.now().plusDays(10), 10,
        TripType.HB, 3, 0 );
    }
}

