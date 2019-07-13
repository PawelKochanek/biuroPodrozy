package pl.piotrpawel.biuropodrozy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import pl.piotrpawel.biuropodrozy.Trip;

import java.util.Optional;

public interface TripRepository<T extends Trip> extends JpaRepository<Trip, Long>, QuerydslPredicateExecutor<Trip> {

    Optional<T> findCountryById(Long id);

}
