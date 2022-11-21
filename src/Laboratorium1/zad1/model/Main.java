package Laboratorium1.zad1.model;

import java.io.IOException;
import java.util.Scanner;

import static Laboratorium1.zad1.model.InputData.*;
import static Laboratorium1.zad1.model.Person.readFromFile;
import static Laboratorium1.zad1.model.Person.saveToFile;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int temp = 1;
            while (temp != 0) {
                System.out.println("Press 1 to: Read a person from a file.");
                System.out.println("Press 2 to: Write all of the people from the list to a file.");
                System.out.println("Press 3 to: Print all of the people working here.");
                System.out.println("Press 4 to: Create a person.");
                System.out.println("Press 5 to: Delete a person(by index) from the list.");
                System.out.println("Press 6 to: Delete a person(by name) from the list.");
                System.out.println("Press 0 to: End the program");

                temp = scanner.nextInt();
                switch (temp) {
                    case 1:
                        readFromFile();
                        break;
                    case 2:
                        saveToFile();
                        break;
                    case 3:
                        printPeople();
                        break;
                    case 4:
                        createPerson();
                        break;
                    case 5:
                        System.out.println("Give an index of the person u want to delete: ");
                        deletePerson();
                        break;
                    case 6:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Give a firstName of the person u want to delete: ");
                        String s1 = scanner1.nextLine();
                        System.out.println("Give a lastName of the person u want to delete: ");
                        String s2 = scanner1.nextLine();
                        deletePerson(s1, s2);
                        break;
                    default:
                        System.out.println("Not available parameter! Try again :) ");
                        break;
                    case 0:
                        return;
                }


            }


        } catch (PersonException | IOException personException) {
            personException.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
