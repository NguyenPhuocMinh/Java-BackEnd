import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập r : ");
        double r = sc.nextDouble();
        double dtht = Math.PI * r * r;
        System.out.println("Diện tích hình tròn là : " + dtht);

        double cvht = 2 * Math.PI * r;
        System.out.println("Chu vi hình trong là : " + cvht);
    }
}
