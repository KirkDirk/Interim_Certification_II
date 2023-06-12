package intrefaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import models.Animal;

public class DBASample implements DBActions{

    /**
     * Путь к файлу БД
     */
    private String dbFileName = "AnimalShelter\\src\\db\\shelter.txt";

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
                                + animal.getAnymalType() + ";"
                                + animal.getClassAnimal() + ";"
                                + animal.getAnimalName() + ";"
                                + animal.getBirthday() + ";" + "\n";
        return animalString;
    }

    @Override
    public int GetNextIdAnimal() {
        File file = new File(this.dbFileName);
        String lastLine = ReadLastLine(file);
        int nextId = 0;
        if (lastLine != null) {
            String[] numbers = lastLine.split(";");            
            nextId = Integer.parseInt(numbers[0]);
            }
        return nextId+1;        
    }

    private static String ReadLastLine(File file) {
        String result = null;
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long startIdx = file.length();
            while (startIdx >= 0 && (result == null || result.length() == 0)) {
                raf.seek(startIdx);
                if (startIdx > 0) 
                    raf.readLine();
                result = raf.readLine();
                startIdx--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String GetAnimalType(Animal animal, String classAnimalFile) {
        String animalType = "";
        try {
            File file = new File(classAnimalFile);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (animalType == "") {
                if (line != null) {
                    String[] animals = line.split(";");    
                    System.out.println(animals);
                    for (int i = 1; i < animals.length; i++) {
                        System.out.println(animals[0] + " " + animals[i] +" "+ animal.getClassAnimal());
                        if (animals[i].toUpperCase().equals(animal.getClassAnimal())) {
                            animalType = animals[0];
                        }
                    }        
                }                
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }    
        return animalType;
    }   
}
