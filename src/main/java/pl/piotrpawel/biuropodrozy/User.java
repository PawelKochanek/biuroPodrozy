package pl.piotrpawel.biuropodrozy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private String name;
    private String lastname;
    private String email;
    private String country;
    private String city;
    private String adress;
    private int phoneNumber;
}
