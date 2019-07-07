package pl.piotrpawel.biuropodrozy;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    private String name;
    private String lastname;
    private String email;
    private String country;
    private String city;
    private String adress;
    private int phoneNumber;

    public User() {}

    public User(String name, String lastname, String email,
                String country, String city, String adress, int phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.country = country;
        this.city = city;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }
}
