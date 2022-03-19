import java.util.Scanner;

public class calculator{
    public static void main (String [] args){
        char operator;
        Double number1 , number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +,-,*,/,or %");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second  number");
        number2 = input.nextDouble();

        switch (operator) {
            case '+' :      
             System.out.println(number1+number2);
            break;
             case '-' : 
             System.out.println(number1-number2);
             break;
             case '*' :
              System.out.println(number1*number2);
             break;
             case '/' : 
             if (number2==0) {
                    System.out.println("invalid division");
                }
                else {
                    System.out.println(number1/number2);
                }
             break;
                case '%' : 
                if (number1==0) {
                    System.out.println("invalid division");
                }
                else{
                    System.out.println(number1%number2);
                }
            break;
            default : 
            System.out.println("invalid division");
        }

    }

}