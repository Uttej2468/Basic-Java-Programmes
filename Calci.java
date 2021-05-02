import java.util.Scanner;
public class Calci 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double first = in.nextDouble();
        double second = in.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");

        char operator = in.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                
                
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            
            default:
                System.out.println("Error! operator is not correct");
                return;
        }
        System.out.println("Number1 \t"+ first + "\t + "+ operator  + "\tNumber 2 \t"+  second  + "=\t"+  result);
    }
}