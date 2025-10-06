class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char op = '*'; 
        int result = 0;
        if (op == '+') {
            result = a + b;
            System.out.println("Addition: " + result);
        }
        if (op == '-') {
            result = a - b;
            System.out.println("Subtraction: " + result);
        } else {
            System.out.println("Not a subtraction operation");
        }
        if (op == '*') {
            result = a * b;
            System.out.println("Multiplication: " + result);
        } else if (op == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println("Division: " + result);
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Other operation chosen.");
  }
        if ((a > 0) & (b > 0)) {
            System.out.println("Both numbers are positive.");
        }
        if ((a < 0) | (b < 0)) {
            System.out.println("Either first number OR second number is negative.");
        }
        boolean isZero = (a == 0 && b == 0);
        if (!isZero) {
            System.out.println("Both numbers are not zero.");
        } else {
            System.out.println("Both numbers are zero.");
        }
        switch (op) {
            case '+':
                System.out.println("Switch -> Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Switch -> Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Switch -> Multiplication: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Switch -> Division: " + (a / b));
                } else {
                    System.out.println("Switch -> Cannot divide by zero!");
                }
                break;
            default:
                System.out.println(" Invalid Operator");
        }
    }
}
