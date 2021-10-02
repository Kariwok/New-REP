package practice.classroom.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Slf4j
public class Person {

    private String name;
    private String surname;
    private int age;
    private double weight;
    private boolean isHetero;

    public void retrieveInformation() {
        System.out.printf(
                "Name is: %s\nSurname is: %s\nAge is: %d\nWeight is: %f\nIs hetero: %s\n",
                name, surname, age, weight, isHetero);
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        }
    }