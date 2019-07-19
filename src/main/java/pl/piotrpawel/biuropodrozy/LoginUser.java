package pl.piotrpawel.biuropodrozy;

import org.springframework.security.core.userdetails.User;

import java.util.Collections;

public class LoginUser extends User {

    public LoginUser(pl.piotrpawel.biuropodrozy.User user) {
        super(user.getEmail(), user.getPassword(), Collections.emptyList());
    }
}
