package intrefaces;

import models.Animal;

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
        
        throw new UnsupportedOperationException("Unimplemented method 'CreateAnimal'");
    }

}