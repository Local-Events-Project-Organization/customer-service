package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class UserEntity {

    @Id
    private long id;

    private String name;

    private String surname;

    private LocalDate birthday;

    private String City;


}
