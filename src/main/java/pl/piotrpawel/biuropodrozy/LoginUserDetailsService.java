package pl.piotrpawel.biuropodrozy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.piotrpawel.biuropodrozy.repository.UserRepository;

import java.util.Optional;

public class LoginUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent()) {
            return new LoginUser(user.get());
        }
        throw new UsernameNotFoundException(email);
    }
}
