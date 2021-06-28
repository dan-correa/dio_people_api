package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor


public enum PhoneType {

    COMMERCIAL("Comercial"),
    HOME("Home"),
    MOBILE("Mobile");

    private final String description;


}
