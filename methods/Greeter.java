package methods;

public class Greeter {

    //method overloading
    public void sayHello() {
        System.out.println("Hello, there!");
    }

    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void sayHello(String name1, String name2) {
        System.out.println("Hello, " + name1 + " and " + name2 + "!");
    }

    // main method (entry point of program)
    public static void main(String[] args) {
        //creating an object
        Greeter greeter = new Greeter();

        //method calls
        greeter.sayHello();                  
        greeter.sayHello("Alice");           
        greeter.sayHello("Bob", "Charlie");  
    }
}
