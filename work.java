public class calculator {
    public static void main(string[] args){
        scanner input = new scanner(system.in);

        system.out.println(x: "Enter first number: ");
        double num1 = input.nextDouble();
        
        system.out.println(x: "Enter second number: ");
        double num2 = input.nextDouble();

        system.out.println(x: "Enter an operator (+, -, *, /)");
        char ch = input.next().charAt(0);

        double result:

        switch(ch){
            case '+': result = num1 + num2;
            break;

            case '-': result = num1 - num2;
            break;

            case '-': result = num1 * num2;
            break;

            case '-': result = num1 / num2;
            break;

            default: system.out.println(x:"invalid operator");
            return;
        }
        system.out.println(num1 + " " + ch + " " + num2 " = " + result);   
    }
}