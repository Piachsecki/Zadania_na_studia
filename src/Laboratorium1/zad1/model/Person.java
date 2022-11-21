package Laboratorium1.zad1.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Laboratorium1.zad1.model.InputData.groupOfPeople;
import static Laboratorium1.zad1.model.ObjectIOServiceImp.filepath;

public class Person {
    private final String firstName;

    private final String lastName;

    private int birthYear;

    private PersonJob job;

    public Person(String firstName, String lastName) throws PersonException {
        if(firstName.isEmpty() || lastName.isEmpty()){
            throw new PersonException("Your first name or second name cannot be empty!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                "first name ='" + firstName + '\'' +
                        ", last name =" + lastName +
                        '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public PersonJob getJob() {
        return job;
    }

    public void setJob(PersonJob job) {
        this.job = job;
    }


    public void setBirthYear(int birthYear) throws PersonException {
        if(!(birthYear >= 1900 && birthYear <=2030)){
            throw new PersonException("Your brithday have to fit " +
                    "the scale of [1900-2030] !");
        }
        this.birthYear = birthYear;
    }

    public static void saveToFile() throws IOException
    {


        FileWriter writer = new FileWriter("file.txt");
        List<Person> temp = new ArrayList<>(groupOfPeople);
        for(Person person: temp) {
            writer.write(person + System.lineSeparator());
        }
        writer.close();
    }

    public static void readFromFile() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Person> ds = (List<Person>)ois.readObject();
        ois.close();


    }

}
