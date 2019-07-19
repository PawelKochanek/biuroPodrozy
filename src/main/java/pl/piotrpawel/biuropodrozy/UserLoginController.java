package pl.piotrpawel.biuropodrozy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class UserLoginController {

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

}
