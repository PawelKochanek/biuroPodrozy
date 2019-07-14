package pl.piotrpawel.biuropodrozy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.piotrpawel.biuropodrozy.config.TripType;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping(value = "/admin")
public class AdminTripController {

    @Autowired
    private TripService tripService;


    @PostMapping(value = "/addtrip")
    public String adminTripAdd(@ModelAttribute(name = "tripFormData") @Valid TripRegistrationDTO customerFormData, Model model) {

//        tripService.addTrip(startCountryName, destinationCountryName,
//                dateTravelFrom, dateTravelTo, daysNumber, tripType,
//                howManyAdultsAreTraveling, howManyChildrenAreTraveling,
//                priceForChild, priceForAdult, isPromoted);
        return "redirect:/admin/trips";
    }

    @GetMapping(value = "/addtrip")
    public String adminTripAdd(Model model) {
        model.addAttribute("tripFormData", new TripRegistrationDTO());
        model.addAttribute("countries", Countries.values());
        model.addAttribute("triptype", TripType.values());
        return "adminTripAdd";
    }
}
