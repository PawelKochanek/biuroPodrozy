package pl.piotrpawel.biuropodrozy;


import lombok.Getter;
import lombok.Setter;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Pattern;

@Getter
@Setter
public class TripRegistrationDTO {

//    @Pattern(regexp = "^[\\p{Lu}][\\p{Ll}]{2,}$", message = "Wymagane przynajmniej 3 znaki(pierwsza litera duża, reszta małe).")
    private String travelFrom;
//    @Pattern(regexp = "^[\\p{Lu}][\\p{Ll}]{2,}(-[\\p{Lu}][\\p{Ll}]{2,})?$", message = "Wymagane przynajmniej 3 znaki(pierwsza litera duża, można podać także nazwisko dwuczłonowe).")
    private String travelTo;
//    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*", message = "Hasło jest wymagane. Musi zawierać od 10 do 20 znaków, jedną duża, jedna małą literę i cyfrę.")
    private String daysNumber;
//    @Pattern(regexp = "^[\\w\\.]+@[\\w]+\\.[\\w]+(\\.[a-z]{2,3})?$", message = "Zły format adresu email")
    private String tripType;
//    @Pattern(regexp = "^\\d{11}$", message = "Zły format. Numer PESEL powinien składać się z 11 cyfr")
    private String priceForAdult;
//    @Pattern(regexp = "^(19|20)[0-9]{2}-(0[1-9]|1[0-2])-(0[1-9]|(1|2)[0-9]|3[0-1])$", message = "Zły format. Data urodzin powinna być podana w formacie RRRR-MM-DD")
    private String priceForChild;
//    @NotBlank(message = "Pole musi zostać wypełnione")
    private Boolean isPromoted;
//    @NotBlank(message = "Pole musi zostać wypełnione")
    private String howManyAdultsAreTraveling;
//    @NotBlank(message = "Pole musi zostać wypełnione")
    private String howManyChildrenAreTraveling;
//    @NotBlank(message = "Pole musi zostać wypełnione")



}
