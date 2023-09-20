import java.text.DecimalFormat;
import java.util.Scanner;

public class Five_B_1 {

    public static void getSolution(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the radius");
        double radius = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("###.###");

        double area = Math.PI * radius * radius;

        double perimeter = 2 * Math.PI * radius;

        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;

        System.out.println("Area = " +df.format(area));
        System.out.println("Perimeter = " +df.format(perimeter));
        System.out.println("Volume = " +df.format(volume));

    }

}
