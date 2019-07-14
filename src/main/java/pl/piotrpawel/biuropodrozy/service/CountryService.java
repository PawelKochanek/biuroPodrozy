package pl.piotrpawel.biuropodrozy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrpawel.biuropodrozy.Country;
import pl.piotrpawel.biuropodrozy.DTO.CountryDTO;
import pl.piotrpawel.biuropodrozy.DTOBulider.CountryToCountryDTOBuilder;
import pl.piotrpawel.biuropodrozy.repository.CountryRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository<Country> countryRepository;
    @Autowired
    private CountryToCountryDTOBuilder countryToCountryDTOBuilder;

    public void addCountry (String name){
        Country country = new Country();

        country.setName(name);
        countryRepository.save(country);
    }

    public void updateCountry(CountryDTO countryDTO) {
        Country country = countryToCountryDTOBuilder.buildEntity(countryDTO);
        countryRepository.save(country);
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @PostConstruct
    private void mockCountries() {
        addCountry("Polska");
        addCountry("Niemcy");
        addCountry("Rosja");
        addCountry("Włochy");
        addCountry("Ukraina");
        addCountry("Hiszpania");
        addCountry("Francja");
        addCountry("Uganda");
    }

    public Optional<Country> findCountryByName(String name) {
        return countryRepository.findCountryByName(name.toLowerCase());
    }
}
