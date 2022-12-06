import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double base,height,Area;

        System.out.print("please enter base = ");
        base = input.nextDouble ();

        System.out.print("please enter Height = ");
        height=input.nextDouble();

        Area=0.5*base*height;
        System.out.println("Area ="+Area);


        double radius;
        System.out.print("Please Enter Radius = ");
        radius=input.nextDouble();

        Area=3.1416*radius*radius;

        System.out.println("Area of Circle is = "+Area);
    }
}
