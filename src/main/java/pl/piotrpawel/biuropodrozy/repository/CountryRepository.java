package pl.piotrpawel.biuropodrozy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import pl.piotrpawel.biuropodrozy.Country;
import pl.piotrpawel.biuropodrozy.Trip;

import java.util.Optional;

public interface CountryRepository<T extends Country> extends JpaRepository<Country, Long>, QuerydslPredicateExecutor<Country> {

    Optional<T> findCountryByName(String name);
}
