package entity;


import java.time.LocalDate;

public class Man extends Human {
    public Man() {
    }

    public Man(Long id, String name, LocalDate birthDate, Address address) {
        super(id, name, birthDate, address);
    }
}