package intrefaces;

import java.io.FileWriter;
import java.io.IOException;

import models.Animal;

public class DBASample implements DBActions{

    /**
     * Путь к файлу БД
     */
    private String dbFileName = "db\\shelter.txt";

    public DBASample(String dbFileName) {
        this.dbFileName = dbFileName;
    }

    @Override
    public void createAnimal(Animal animal) {
        try (FileWriter wrtr = new FileWriter(dbFileName, true)) {
            wrtr.write(animalToString(animal));
            wrtr.flush();
            wrtr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private String animalToString(Animal animal){
        String animalString = Integer.toString(animal.getIdAnimal()) + ";"
                                + animal.getClassAnimal() + ";"
                                + animal.getAnimalName() + ";"
                                + animal.getBirthday() + ";";
        return animalString;
    }
}
