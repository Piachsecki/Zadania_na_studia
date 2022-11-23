package Lab3;

import java.util.Scanner;

import static Lab3.Tour.*;


public class Main {
    static public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer temp = 1;
        do{
            Tour tour = new Tour();
            if(temp == 7){

                System.out.println("Enter a country: ");
                String country = scanner.nextLine();
                System.out.println("Enter a capitol: ");
                String city = scanner.nextLine();
                tour.setCountry(country);
                tour.setCapitol(city);
            }

            System.out.println("Enter 7 to: add a country and its capitol");
            System.out.println("Enter 1 to: add this to collection A ");
            System.out.println("Enter 2 to: add this to collection B ");
            System.out.println("Enter 3 to: add this to collection C ");
            System.out.println("Enter 4 to: print collection A");
            System.out.println("Enter 5 to: print collection B");
            System.out.println("Enter 6 to: print collection C");
            System.out.println("Enter 8 to: check if your collectionA has this city!");
            System.out.println("Enter 9 to: check if your collectionB has this city!");
            System.out.println("Enter 10 to: check if your collectionC has this country!");
            System.out.println("Enter 0 to: end this program");

            temp = Integer.valueOf(scanner.nextLine());
            switch (temp){
                case 1:
                    collectionA.add(tour.getCapitol());
                    break;
                case 2:
                    collectionB.add(tour.getCapitol());
                    break;
                case 3:
                    collectionC.put(tour.getCountry(), tour.getCapitol());
                    break;
                case 4:
                    System.out.println(collectionA);
                    break;
                case 5:
                    System.out.println(collectionB);
                    break;
                case 6:
                    System.out.println(collectionC);
                    break;
                case 7:
                    continue;
                case 8:
                    System.out.println("Enter the city you want to check: ");
                    String ex1 = scanner.nextLine();
                    System.out.println(checkA(ex1));
                    break;
                case 9:
                    System.out.println("Enter the city you want to check: ");
                    String ex2 = scanner.nextLine();
                    System.out.println(checkB(ex2));
                    break;
                case 10:
                    System.out.println("Enter the country you want to check: ");
                    String ex3 = scanner.nextLine();
                    System.out.println(checkC(ex3));
                    break;
                default:
                    System.out.println("Not defined option ->  try again !");
            }

        }while (temp!=0);


    }
}


