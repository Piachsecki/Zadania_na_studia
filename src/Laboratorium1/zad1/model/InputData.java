package Laboratorium1.zad1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputData {
    public static  List<Person> groupOfPeople = new ArrayList<>();


    public void setGroupOfPeople(List<Person> groupOfPeople) {
        this.groupOfPeople = groupOfPeople;
    }

    public List<Person> getGroupOfPeople() {
        return groupOfPeople;
    }

    public InputData(List<Person> groupOfPeople) {
        this.groupOfPeople = groupOfPeople;
    }


    public static void createPerson() throws PersonException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner1.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner1.nextLine();
        System.out.println("Enter one of the occupations:  " + Arrays.toString(PersonJob.values()));
        String occupation = scanner1.nextLine();
        System.out.println("Enter your birthday: ");
        int birthday = scanner1.nextInt();
//        scanner1.close();
        Person person = new Person(firstName, lastName);
        PersonJob personJob = Enum.valueOf(PersonJob.class, occupation);
        person.setJob(personJob);
        person.setBirthYear(birthday);
        groupOfPeople.add(person);
    }


    public static void deletePerson(){
        Scanner scanner1 = new Scanner(System.in);
        int index = scanner1.nextInt();
        groupOfPeople.remove(index);
    }

    public static void deletePerson(String firstName, String secondName) throws PersonException {
        groupOfPeople.remove(new Person(firstName, secondName));
    }

    public static void printPeople(){
        System.out.println(groupOfPeople);
    }
}
