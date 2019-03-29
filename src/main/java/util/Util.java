package util;

import dto.UserDTO;
import entity.Address;
import entity.User;

import java.time.LocalDate;

import static java.lang.Math.random;

public class Util {

    public static LocalDate getRandomDate(){
        return LocalDate.of((int) (1950 + random() * 60),
                (int) (1 + random() * 11),
                (int) (1 + random() * 27));
    }

    public static UserDTO initRandomUserDTO(){
        return new UserDTO((long) (random() * 100),
                "User",
                getRandomDate(),
                new Address("City",
                        "Street",
                        (int) (random() * 200)));
    }
}
