package pl.piotrpawel.biuropodrozy.repository;

import org.springframework.data.repository.CrudRepository;
import pl.piotrpawel.biuropodrozy.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmail(String email);
}