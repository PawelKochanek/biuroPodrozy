package pl.piotrpawel.biuropodrozy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter @Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Country extends BaseEntity{

    private String name;

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}
