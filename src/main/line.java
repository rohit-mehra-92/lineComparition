import java.util.Objects;
import java.util.Scanner;

public class line {
    public static void main(String[] args) {

        Double x1, y1, x2, y2;
        Double line1;

        Scanner num = new Scanner(System.in);
        System.out.println("enter the value of x1");
        x1 = num.nextDouble();

        System.out.println("enter the value of y1");
        y1 = num.nextDouble();

        System.out.println("enter the value of x2");
        x2 = num.nextDouble();

        System.out.println("enter the value of y2");
        y2 = num.nextDouble();

        line1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of the line1 is :" + line1);

        Double a1,b1,a2,b2;
        Double line2;
        System.out.println("enter the value of a1");
        a1 = num.nextDouble();

        System.out.println("enter the value of b1");
        b1 = num.nextDouble();

        System.out.println("enter the value of a2");
        a2 = num.nextDouble();

        System.out.println("enter the value of b2");
        b2 = num.nextDouble();

        line2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
        System.out.println("Length of the line2 is :" + line2);

        if (line1.compareTo(line2)==0)
            System.out.println("lines are equal");
        else if (line1.compareTo(line2)>0)
            System.out.println("lines1 is greater than line2");
        else if (line1.compareTo(line2)<0)
            System.out.println("line1 is smaller than line2");
    }
}
