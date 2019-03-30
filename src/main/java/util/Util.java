package util;

import dto.AddressDTO;
import dto.ManDTO;
import dto.WomanDTO;

import java.time.LocalDate;

import static java.lang.Math.random;

public class Util{

    public static LocalDate getRandomDate(){
        return LocalDate.of((int) (1950 + random() * 60),
                (int) (1 + random() * 11),
                (int) (1 + random() * 27));
    }

    public static ManDTO initRandomManDTO(){
        return new ManDTO((long) (random() * 100),
                "ManDTO",
                getRandomDate(),
                new AddressDTO("City",
                        "Street",
                        (int) (random() * 200)));
    }

    public static WomanDTO initRandomWomanDTO(){
        return new WomanDTO((long) (random() * 100),
                "WomanDTO",
                getRandomDate(),
                new AddressDTO("City",
                        "Street",
                        (int) (random() * 200)));
    }
}
