import java.util.Scanner;

public class line {
    public static void main(String[] args) {

        int x1, y1, x2, y2;
        double line1;

        Scanner num = new Scanner(System.in);
        System.out.println("enter the value of x1");
        x1 = num.nextInt();

        System.out.println("enter the value of y1");
        y1 = num.nextInt();

        System.out.println("enter the value of x2");
        x2 = num.nextInt();

        System.out.println("enter the value of y2");
        y2 = num.nextInt();

        line1 = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length of the line1 is :" + line1);

        int a1,b1,a2,b2;
        double line2;
        System.out.println("enter the value of a1");
        a1 = num.nextInt();

        System.out.println("enter the value of b1");
        b1 = num.nextInt();

        System.out.println("enter the value of a2");
        a2 = num.nextInt();

        System.out.println("enter the value of b2");
        b2 = num.nextInt();

        line2 = Math.sqrt((a2-a1)^2 + (b2-b1)^2);
        System.out.println("Length of the line2 is :" + line2);

        if (line1 == line2)
            System.out.println("line are equal");
        else
            System.out.println("line are not equal");

    }
}
