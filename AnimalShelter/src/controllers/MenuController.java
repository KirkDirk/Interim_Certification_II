package controllers;

import intrefaces.MenuManagable;
import models.Animal;

public class MenuController {
    private MenuManagable menuManagable;
    //private DBActions dbActions;
    
    public MenuController(MenuManagable menuManagable) {
        this.menuManagable = menuManagable;
    }  
    
    // public MenuController(DBActions dbActions) {
    //     this.dbActions = dbActions;
    // }

    public void CreateAnimal(Animal animal){
        menuManagable.CreateAnimal(animal);
    }

    public int GetNextIdAnimal() {
        return menuManagable.GetNextIdAnimal();
    }

    public String[] GetClassAnimal(){
        return menuManagable.GetClassAnimal();
    }
    
    

}
