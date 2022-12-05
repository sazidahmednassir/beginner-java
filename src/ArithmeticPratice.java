import java.util.Scanner;

public class ArithmeticPratice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number ");

        int num1 , num2, result;

        num1= input.nextInt();

        System.out.println("enter second number ");

        num2= input.nextInt();

        result=num1+num2;
        System.out.println("input sum "+result);

        num1=80;
        num2=30;
        result=num1+num2;
        System.out.println(result);

        result=num1-num2;
        System.out.println(result);

        result=num1*num2;
        System.out.println(result);

        float result1= (float) num1/num2;
        System.out.println(result1);

        result=num1%num2;
        System.out.println(result);
    }
}
