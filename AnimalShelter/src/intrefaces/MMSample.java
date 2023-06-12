package intrefaces;

import java.util.stream.Stream;

import models.Animal;
import models.ClassAnimal;

/**
 * MMSample
 */
public class MMSample implements MenuManagable {
    private DBActions dbActions;

    public MMSample(DBActions dbActions) {
        this.dbActions = dbActions;
    }

    @Override
    public void CreateAnimal(Animal animal) {            
        dbActions.createAnimal(animal);
    }

    @Override
    public String[] GetClassAnimal() {
        String[] valuesClassAnimal = Stream.of(ClassAnimal.values()).map(ClassAnimal::name).toArray(String[]::new);
        return valuesClassAnimal;
    }

    @Override
    public int GetNextIdAnimal() {
        return dbActions.GetNextIdAnimal();        
    }

    @Override
    public String GetAnimalType(Animal animal, String classAnimalFile) {
        return dbActions.GetAnimalType(animal, classAnimalFile);
    }

}