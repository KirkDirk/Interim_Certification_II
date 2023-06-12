package intrefaces;

import models.Animal;

public interface MenuManagable {
    
    public void CreateAnimal(Animal animal);

    public String[] GetClassAnimal();

    public int GetNextIdAnimal();

    public String GetAnimalType(Animal animal, String classAnimalFile);
}
