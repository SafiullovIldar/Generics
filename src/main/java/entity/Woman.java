package entity;


import java.time.LocalDate;

public class Woman extends Human {

    public Woman() {
    }

    public Woman(Long id, String name, LocalDate birthDate, Address address) {
        super(id, name, birthDate, address);
    }
}
