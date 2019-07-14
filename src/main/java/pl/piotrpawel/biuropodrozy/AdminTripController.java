package pl.piotrpawel.biuropodrozy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.piotrpawel.biuropodrozy.DTO.AddTripDTO;
import pl.piotrpawel.biuropodrozy.config.TripType;
import pl.piotrpawel.biuropodrozy.service.CountryService;
import pl.piotrpawel.biuropodrozy.service.TripService;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/admin")
public class AdminTripController {

    @Autowired
    private TripService tripService;

    @Autowired
    private CountryService countryService;


    @PostMapping(value = "/addtrip")
    public String adminTripAdd(@ModelAttribute(name = "tripFormData") @Valid AddTripDTO customerFormData, Model model) {

//        tripService.addTrip(startCountryName, destinationCountryName,
//                dateTravelFrom, dateTravelTo, daysNumber, tripType,
//                howManyAdultsAreTraveling, howManyChildrenAreTraveling,
//                priceForChild, priceForAdult, isPromoted);
        return "redirect:/admin/trips";
    }

    @GetMapping(value = "/addtrip")
    public String adminTripAdd(Model model) {
        model.addAttribute("tripFormData", new AddTripDTO());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("triptype", TripType.values());
        return "adminTripAdd";
    }
}
