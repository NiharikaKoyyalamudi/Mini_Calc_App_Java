import java.util.Scanner;

class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        
        while (!isExit) {
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Factorial");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. a Power b");
            System.out.println("11. a Root b");
            System.out.println("0. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers to add:");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    double result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                    
                case 2:
                    System.out.println("Enter two numbers to subtract:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                    
                case 3:
                    System.out.println("Enter two numbers to multiply:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                    
                case 4:
                    System.out.println("Enter two numbers to divide:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                    
                case 5:
                    System.out.println("Enter a number to find percentage:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter the percentage value:");
                    double percent = scanner.nextDouble();
                    result = (num1 * percent) / 100;
                    System.out.println("Result: " + result);
                    break;
                    
                case 6:
                    System.out.println("Enter a number to find factorial:");
                    int num = scanner.nextInt();
                    result = 1;
                    for (int i = num; i >= 1; i--) {
                        result *= i;
                    }
                    System.out.println("Result: " + result);
                    break;
                    
                case 7:
                    System.out.println("Enter a number to find square:");
                    num1 = scanner.nextDouble();
                    result = num1 * num1;
                    System.out.println("Result: " + result);
                    break;
                    
                case 8:
                    System.out.println("Enter a number to find cube:");
                    num1 = scanner.nextDouble();
                    result = num1 * num1 * num1;
                    System.out.println("Result: " + result);
                    break;
                    
                case 9:
                    System.out.println("Enter a number to find square root:");
                    num1 = scanner.nextDouble();
                    if (num1 < 0) {
                        System.out.println("Invalid input");
                    } else {
                        result = Math.sqrt(num1);
                        System.out.println("Result: " + result);
                    }
                    break;
                    
                case 10:
                    System.out.println("Enter two numbers for a power b:");
			  num1 = scanner.nextDouble();
			  num2 = scanner.nextDouble();
			  result = Math.pow(num1, num2);
			  System.out.println("Result: " + result);
			  break;
            case 11:
                System.out.println("Enter two numbers for a root b:");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    System.out.println("Cannot take 0th root");
                } else if (num1 < 0 && num2 % 2 == 0) {
                    System.out.println("Invalid input");
                } else {
                    result = Math.pow(num1, 1.0 / num2);
                    System.out.println("Result: " + result);
                }
                break;
                
            case 0:
                isExit = true;
                System.out.println("Exiting calculator app");
                break;
                
            default:
                System.out.println("Invalid choice, please try again");
                break;
        }
        
        System.out.println();
    }
    
    scanner.close();
  }
}

