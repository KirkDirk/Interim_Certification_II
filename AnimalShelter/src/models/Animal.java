package models;

import java.time.LocalDate;

public class Animal extends AbstractAnimal {
    //private int kindId = 0;

    public Animal(int idAnimal, String classAnimal, String animalName, LocalDate birthday) {
        super(idAnimal, classAnimal, animalName, birthday);
    }

    public Animal() {
        super();
    }

    
    
    // public Animal(int idAnimal, ClassAnimal classAnimal, String animalName, Date birthday, int kindId) {
    //     this(idAnimal, classAnimal, animalName, birthday);
    //     this.kindId = kindId;
    // }

    // public int getKindId() {
    //     return kindId;
    // }

    
}
