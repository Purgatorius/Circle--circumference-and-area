import java.util.Scanner;

/**
 * Created by B4RT on 2017-05-10.
 */
public class CircleCircumferenceArea {
    public static void main (String args[])
    {
        System.out.println("This program calculates circumference and area of given radius (r) of circle");
        int r;
        Scanner scanner = new Scanner(System.in);
        System.out.print("r=");
        r = scanner.nextInt();
        System.out.println("Field = " + (r*r*3.14));
        System.out.println("Circuit = " + (2*3.14*r));


    }
}
