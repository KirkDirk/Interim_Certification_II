package intrefaces;


import models.Animal;

public interface DBActions {
    
    public void CreateAnimal(Animal animal);

    public int GetNextIdAnimal();

    public String GetAnimalType(Animal animal, String classAnimalFile);

    public Animal GetAnimalById(int findId);

     
}
