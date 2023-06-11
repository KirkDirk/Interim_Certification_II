package models;

import java.sql.Date;

public abstract class AbstractAnimal {
    /**
     * ID животного в БД
     */
    protected int idAnimal;
    protected ClassAnimal classAnimal;
    protected String animalName;
    protected Date birthday;

    public AbstractAnimal(int idAnimal, ClassAnimal classAnimal, String animalName, Date birthday) {
        this.idAnimal = idAnimal;
        this.classAnimal = classAnimal;
        this.animalName = animalName;
        this.birthday = birthday;
    }

    public AbstractAnimal(){
        idAnimal = 0;
        classAnimal = ClassAnimal.NONE;
        animalName = "";
        birthday = null;

    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public ClassAnimal getClassAnimal() {
        return classAnimal;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setClassAnimal(ClassAnimal classAnimal) {
        this.classAnimal = classAnimal;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }      
        
}
