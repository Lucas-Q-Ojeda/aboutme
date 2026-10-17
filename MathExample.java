import java.util.*;

public class MathExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MathOperations mo = new MathOperations();

        System.out.println("Operations: add, subtract, multiply, divide");

        String operation = "";
        while (true) {
            System.out.print("Operation: ");
            operation = s.next().toLowerCase();
            if (operation.equals("add") || operation.equals("subtract") || 
                operation.equals("multiply") || operation.equals("divide")) {
                break;
            } else {
                System.out.println("Invalid, use: add, subtract, multiply, divide");
            }
        }

        int aValue = readInteger(s, "A Value: ");
        int bValue = readInteger(s, "B Value: ");

        switch (operation) {
            case "add":
                System.out.println("The result of the operation: " + mo.add(aValue, bValue));
                break;
            case "subtract":
                System.out.println("The result of the operation: " + mo.subtract(aValue, bValue));
                break;
            case "multiply":
                System.out.println("The result of the operation: " + mo.multiply(aValue, bValue));
                break;
            case "divide":
                if (bValue == 0) {
                    System.out.println("Error: No se puede dividir por 0");
                } else {
                    System.out.println("Resultado: " + mo.divide(aValue, bValue));
                }
                break;
        }
        s.close();
    }

    public static int readInteger(Scanner s, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a number!");
                s.next(); 
            }
        }
    }
}

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public long add(long a, long b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public long subtract(long a, long b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public long multiply(long a, long b) { return a * b; }
    public double divide(int a, int b) { return (double) a / b; }
}
