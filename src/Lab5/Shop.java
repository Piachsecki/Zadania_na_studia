package Lab5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Lab5.Fruit.*;

public class Shop {
    public static void main(String[] args) {
        Fruit item1 = new Fruit();
        Fruit item2 = new Fruit(new TasteOfFruit("sweet"),
                new DateOfUsage(LocalDate.of(2023, 12, 14)),
                "Apple",
                "Green",
                "Poland"
                );
        Fruit item3 = new Fruit(item2);

        Fruit[] fruits = new Fruit[3];
        // if we try to print this array on terminal - nothing will change ->
        //the array is not initialized!
        Arrays.fill(fruits, new Fruit());

        //printing the array of fruits
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("------------");


        List<Fruit> listOfFruits = new ArrayList<>();
        listOfFruits.add(item1);
        listOfFruits.add(item2);
        listOfFruits.add (item3);

        //printing the whole collection
        System.out.println(listOfFruits);

        System.out.println("------------");
        //printing the items individually
        System.out.println(item1);
        System.out.println("------------");
        System.out.println(item2);
        System.out.println("------------");
        System.out.println(item3);

        //printing all of the 'unique' objects that have been created
        System.out.println(getIdStatic_());
        //printing all of the objects that have been created
        System.out.println(getCountStatic_());

        //showing that non-static fields haven't changed during the work
        //of the program itself, because it is connected to the one object
        //only
//        System.out.println(item1.getIdNonStatic_());
//        System.out.println(item2.getIdNonStatic_());
//        System.out.println(item3.getIdNonStatic_());
//
//        System.out.println("------------");
//
//        System.out.println(item1.getCountNonStatic_());
//        System.out.println(item2.getCountNonStatic_());
//        System.out.println(item3.getCountNonStatic_());

    }
}
