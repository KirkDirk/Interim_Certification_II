package models;

import java.time.LocalDate;

public class Animal extends AbstractAnimal {
    private String anymalType;

    public Animal(int idAnimal, String classAnimal, String animalName, LocalDate birthday) {
        super(idAnimal, classAnimal, animalName, birthday);
    }

    public Animal() {
        super();
    }
    
    public Animal(int idAnimal, String classAnimal, String animalName, LocalDate birthday, String animalType) {
        this(idAnimal, classAnimal, animalName, birthday);
        this.anymalType = animalType;
    }

    public String getAnymalType() {
        return anymalType;
    }

    public void setAnymalType(String anymalType) {
        this.anymalType = anymalType;
    }    
}
