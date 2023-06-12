package intrefaces;


import models.Animal;

public interface DBActions {
    
    public void createAnimal(Animal animal);

    public int GetNextIdAnimal();

    public String GetAnimalType(Animal animal, String classAnimalFile);

     
}
