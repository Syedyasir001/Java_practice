package exception;

import java.io.*;

public class exception1 {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }

        // FileNotFoundException
        try {
            FileReader fr = new FileReader("nofile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught: " + e);
        }
    }
}
