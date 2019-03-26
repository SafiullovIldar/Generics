package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private LocalDate  birthDate;
    private Address address;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {

        private String city;
        private String streetName;
        private int flatNumber;
    }
}
