//package pl.piotrpawel.biuropodrozy;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import pl.piotrpawel.biuropodrozy.config.TripType;
//
//import java.time.LocalDate;
//
//@Controller
//@RequestMapping(value = "/admin")
//public class AdminTripController {
//
//    @Autowired
//    private TripService tripService;
//
//    @PostMapping(value = "/trip/add")
//    public String addTrip(@RequestParam Country startCountryName,
//                          @RequestParam Country destinationCountryName,
//                          @RequestParam LocalDate dateTravelFrom,
//                          @RequestParam LocalDate dateTravelTo,
//                          @RequestParam int daysNumber,
//                          @RequestParam TripType tripType,
//                          @RequestParam int howManyAdultsAreTraveling,
//                          @RequestParam int howManyChildrenAreTraveling,
//                          @RequestParam long priceForChild,
//                          @RequestParam long priceForAdult,
//                          @RequestParam boolean isPromoted){
//        tripService.addTrip(startCountryName, destinationCountryName,
//                dateTravelFrom, dateTravelTo, daysNumber, tripType,
//                howManyAdultsAreTraveling, howManyChildrenAreTraveling,
//                priceForChild, priceForAdult, isPromoted);
//        return "redirect:/admin/trips";
//    }
//}
