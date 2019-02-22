import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập năm sinh của bạn : ");
        int ns = sc.nextInt();

        int tinhtuoi = 2019 - ns;
        System.out.println("Tuổi của bạn là : " + tinhtuoi);
    }
}
