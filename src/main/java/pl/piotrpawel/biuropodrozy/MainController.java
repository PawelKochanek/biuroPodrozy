package pl.piotrpawel.biuropodrozy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    // przekierowuje, np. gdy wpiszemy /home, to przekierowuje odpowiednio na daną podstronę




    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello User!";
    }

}