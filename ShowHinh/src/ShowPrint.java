import java.util.Scanner;

public class ShowPrint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.print("Enter number you choice : ");

        int choice;

        while (true) {
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    System.out.println("****************");

                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    int n = input.nextInt();

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < i + n; j++) {
                            if (j < n - 1 - i) {
                                System.out.print("   ");
                            } else {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
