package views;

import java.util.Scanner;

import controllers.MenuController;
import models.Animal;

public class ViewShelter {
    private MenuController menuController;

    public ViewShelter(MenuController menuController) {
        this.menuController = menuController;
    }

    public void run() {

        /** Текущий выбор меню пользователем. */
        CommandBaseView com = CommandBaseView.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            com = CommandBaseView.valueOf(command.toUpperCase());
            if (com == CommandBaseView.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE:
                        menuController.CreateAnimal(null);
                        break;
                    case READ:
                        
                        break;
                    case DELETE:
                    
                        break;
                    case TOCLASS:
                        
                        break;
                    
                }
            } catch (Exception e) {
                System.out.println("Что-то пошло не так: " + e.getMessage());
            }
        }
    }

    /**
     * Получение данных с одного ввода с консоли
     * 
     * @param message выводимое сообщение
     * @return String
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Animal getNewAnimalFromConsole() {
        Animal animal = new Animal();
        /** Устанавливаем для текущей записи значения ID, вида животного, его имени и даты рождения*/
        //animal.setIdNote(menuController.getNumberOfNotes() + 1);
        
        
        return animal;
    }
}
