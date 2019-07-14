package pl.piotrpawel.biuropodrozy.DTOBulider;

import org.springframework.stereotype.Service;
import pl.piotrpawel.biuropodrozy.Country;
import pl.piotrpawel.biuropodrozy.DTO.CountryDTO;

@Service
public class CountryToCountryDTOBuilder {

    public CountryDTO countryDTO (Country country) {
        return CountryDTO.builder()
                .name(country.getName())
                .build();
    }

    public Country buildEntity(CountryDTO countryDTO) {
        Country country = new Country();

        country.setName(countryDTO.getName());
        return country;
    }
}
