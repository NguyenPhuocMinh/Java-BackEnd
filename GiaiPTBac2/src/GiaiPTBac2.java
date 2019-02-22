import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        // PT : ax2 + bx + c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        float a = sc.nextInt();
        System.out.print("Nhập b : ");
        float b = sc.nextInt();
        System.out.print("Nhập c : ");
        float c = sc.nextInt();
        float x;
        float x1;
        float x2;
        float delta;
        float candelta;
        if (a == 0) {
            // bx + c = 0;
            x = -c / b;
            System.out.println(x);
        } else {
            if (a != 0) {
                delta = (b * b) - (4 * a * c);
                if (delta > 0) {
                    candelta = (float) Math.sqrt(delta);
                    x1 = candelta / (2 * a);
                    x2 = (-candelta) / (2 * a);
                    System.out.println("Phương trình có nghiệm là x1 = " + x1 + " và x2 = " + x2);
                } else if (delta == 0) {
                    x = -b / (2 * a);
                    System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        }
    }
}
