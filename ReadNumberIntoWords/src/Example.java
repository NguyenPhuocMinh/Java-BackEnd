import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần đọc : ");
        int n = input.nextInt();
        docSo(n);
    }

    public static void docChuSo(int chuso) {
        if (chuso == 0) {
            System.out.print(" Không ");
        } else if (chuso == 1) {
            System.out.print(" Một ");
        } else if (chuso == 2) {
            System.out.print(" Hai ");
        } else if (chuso == 3) {
            System.out.print(" Ba ");
        } else if (chuso == 4) {
            System.out.print(" Bốn ");
        } else if (chuso == 5) {
            System.out.print(" Năm ");
        } else if (chuso == 6) {
            System.out.print(" Sáu ");
        } else if (chuso == 7) {
            System.out.print(" Bảy ");
        } else if (chuso == 8) {
            System.out.print(" Tám ");
        } else if (chuso == 9) {
            System.out.print(" Chín ");
        }
    }

    public static int demSoLuongChuSo(int n) {
        int dem = 0;
        while (n != 0) {
            n /= 10;
            dem++;
        }
        return dem;
    }

    public static void docSo(int n) {
        int soDao = 0;
        while (n != 0) {
            soDao = soDao * 10 + n % 10;
            n /= 10;
        }

        int soLuong = demSoLuongChuSo(soDao);
        while (soDao != 0) {
            docChuSo(soDao % 10);
            if (soLuong == 4) {
                System.out.print(" Ngàn ");
            }
            if (soLuong == 3) {
                System.out.print(" Trăm ");
            }
            if (soLuong == 2) {
                System.out.print(" Mươi ");
            }
            soLuong--;
            soDao /= 10;
        }
    }
}
