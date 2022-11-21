package Lab2;

import static Lab2.Fib.fibbI;
import static Lab2.Fib.fibbR;
import static Lab2.Printer.print_even;

public class Main {
    public static void main(String[] args) {
//        print_even(5);
        System.out.println(fibbI(5));
        System.out.println(fibbR(5));
    }
}
