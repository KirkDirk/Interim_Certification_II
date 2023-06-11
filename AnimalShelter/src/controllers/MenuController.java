package controllers;

import intrefaces.MenuManagable;
import models.Animal;

public class MenuController {
    private MenuManagable MenuManagable;

    public MenuController(MenuManagable menuManagable) {
        this.MenuManagable = menuManagable;
    }
    
    public void CreateAnimal(Animal animal){
        MenuManagable.CreateAnimal(animal);
    }
    

}
