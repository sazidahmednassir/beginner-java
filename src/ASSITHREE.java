import java.util.Scanner;

public class ASSITHREE {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int id;
        System.out.print("Enter id : ");
        id = input.nextInt();
        Scanner input1 = new Scanner (System.in);

        String title,price,description,category;

        System.out.print("Enter Title: ");
        title= input1.nextLine();

        System.out.print("Enter price : ");
        price = input1.nextLine();

        System.out.print("Enter description : ");
        description = input1.nextLine();

        System.out.print("Enter Category : ");
        category = input1.nextLine();

        System.out.println(id);
        System.out.println(title);
        System.out.println(price);
        System.out.println(description);
        System.out.println(category);
    }
}
