import java.util.Scanner;

public class ChangeUSDToVND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money USD to change VND: ");
        double vnd = 23000;
        double usd = sc.nextDouble();
        double changeto = usd * vnd;
        System.out.println(changeto + " VNĐ ");
    }
}
