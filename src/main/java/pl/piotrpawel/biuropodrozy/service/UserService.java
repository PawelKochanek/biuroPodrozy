package pl.piotrpawel.biuropodrozy.service;

import pl.piotrpawel.biuropodrozy.User;

import java.util.Optional;

public interface UserService {

    void save(User user);

    Optional<User> findByEmail(String email);
}
