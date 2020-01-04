package com.example.firstjpademo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Person {
    public enum Gender {FEMALE, MALE};
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate birthDate;
    private Gender gender;

    public Person() {
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.birthDate = LocalDate.now();
        this.gender = gender;
    }

    public Person(String name, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" + id + "}, " + gender + ", " + name + " born: " + birthDate;
    }
}
