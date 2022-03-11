import java.util.Scanner;

public class line {
    public static void main(String[] args) {

        int x1,y1,x2,y2;
        double distance;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of x1");
            x1 = sc.nextInt();

        System.out.println("enter the value of y1");
            y1 = sc.nextInt();

        System.out.println("enter the value of x2");
            x2 = sc.nextInt();

        System.out.println("enter the value of y2");
            y2 = sc.nextInt();

        distance = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("distance between two line is: " + distance);
    }
}

