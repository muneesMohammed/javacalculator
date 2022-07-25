
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Select a option");
        System.out.println("1.Press enter to add");
        System.out.println("2.Press enter to sub");
        System.out.println("3.Press enter to mul");
        System.out.println("4.Press enter to div");
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();
        switch (option) {
            case 1:
                System.out.println("enter first number");
                int x = s.nextInt();
                System.out.println("enter second numbere");
                int y = s.nextInt();
                int z = x + y;
                System.out.println(z);
                break;
            case 2:
                System.out.println("enter first number");
                int x1 = s.nextInt();
                System.out.println("enter second numbere");
                int y1 = s.nextInt();
                int z1 = x1 - y1;
                System.out.println(z1);
                break;
            case 3:
                System.out.println("enter first number");
                int x2 = s.nextInt();
                System.out.println("enter second numbere");
                int y2 = s.nextInt();
                int z2 = x2 * y2;
                System.out.println(z2);
                break;
            case 4:
                System.out.println("enter first number");
                int x3 = s.nextInt();
                System.out.println("enter second numbere");
                int y3 = s.nextInt();
                int z3 = x3 / y3;
                System.out.println(z3);
                break;
            default:
                System.out.println("invalid");


        }
    }
}
