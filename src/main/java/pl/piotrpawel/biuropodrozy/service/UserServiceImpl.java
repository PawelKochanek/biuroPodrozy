package pl.piotrpawel.biuropodrozy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.piotrpawel.biuropodrozy.User;
import pl.piotrpawel.biuropodrozy.repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
    }
    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }
}
