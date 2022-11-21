package Lab2;

public class Fib {
    public static int fibbI(int n){
        int temp = 1;
        int z = 1;
        int a;
        for (int i = 0; i < n - 2; i++) {
            a = temp;
            temp = temp +  z;
            z = a;
        }
        return temp;
    }

    public static int fibbR(int n){
        if (n <= 1)
        return n;

        return fibbR(n - 1) + fibbR(n - 2);
    }
}
