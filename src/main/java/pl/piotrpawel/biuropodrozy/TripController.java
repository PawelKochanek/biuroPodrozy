package pl.piotrpawel.biuropodrozy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Set;

@Controller
public class TripController {

    Set<Trip> trips = new HashSet<>();

    @GetMapping("/trip")
    @ResponseBody
    public ModelAndView getTrip() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addTrip");
        initTrip();
        modelAndView.addObject("trips",trips);
        return modelAndView;
    }
    public void initTrip() {
        trips.add(TripsDataBase.trip_1);
        trips.add(TripsDataBase.trip_2);
        trips.add(TripsDataBase.trip_3);
    }
}
