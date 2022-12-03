import java.util.Scanner;

public class InputPratice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter Any Number : ");
        number= input.nextInt();
        System.out.println("number "+number);
        Scanner input1 = new Scanner (System.in);
        String name;
        System.out.print("Enter Any Name : ");
        name = input1.nextLine();
        System.out.println("Welcome "+name);

    }
}
