package views;


import java.time.LocalDate;
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
                        Animal animal1 = getNewAnimalFromConsole();
                        menuController.CreateAnimal(animal1);
                        System.out.println("\n Животное записано в реестре");
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
     * @param message выводимое сообщение
     * @return String
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public Animal getNewAnimalFromConsole() {
        Animal animal = new Animal();
        /** Устанавливаем для текущей записи значения ID животного*/
        int id = menuController.GetNextIdAnimal();
        animal.setIdAnimal(id);
        
        /** Устанавливаем для текущей записи значение вида животного */
        String[] allClassAnimal = menuController.GetClassAnimal();
        System.out.println("\n Выберите класс животного:");
        for (int i = 0; i < allClassAnimal.length-1; i++) {
            System.out.println(Integer.toString(i+1) + " - " + allClassAnimal[i]);
        }
        String selectedAnimalClass = prompt(" Укажите цифру вида животного: ");
        animal.setClassAnimal(allClassAnimal[Integer.parseInt(selectedAnimalClass)-1]);
        /** Устанавливаем для текущей записи имя животного */
        animal.setAnimalName(prompt(" Введите имя животного: "));
        /** Устанавливаем для текущей записи дату рождения животного */
        LocalDate localDate = LocalDate.parse(prompt(" Введите дату рождения животного в формате ГГГГ-ММ-ДД: "));
        animal.setBirthday(localDate);

        return animal;
    }
}
