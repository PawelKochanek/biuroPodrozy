package pl.piotrpawel.biuropodrozy;

import lombok.*;

import javax.persistence.Entity;

@Getter @Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country extends BaseEntity{

    private String name;
}
