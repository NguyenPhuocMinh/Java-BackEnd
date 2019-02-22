import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm vật lý :");
        float vl = sc.nextFloat();
        System.out.print("Nhập điểm hóa học :");
        float hh = sc.nextFloat();
        System.out.print("Nhập điểm sinh học : ");
        float sh = sc.nextFloat();

        float dtb = (vl + hh + sh)/3;
        System.out.println("Điểm trung bình là :" + dtb);
        float td = vl + hh + sh;
        System.out.println("Tổng điểm là : " + td);
    }
}
