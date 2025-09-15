package methods;

public class Calculator {
    //method
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        //calling the method to perform addition
        int result = myCalc.add(5, 10);

        System.out.println("The sum is: " + result);
    }

}
