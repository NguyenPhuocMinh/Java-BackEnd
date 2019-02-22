import java.util.Scanner;

public class Show20FirstPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 20 numbers is Prime show you? ");
        int numbers;
        numbers = sc.nextInt();
        int count = 0;
        int n = 2;

        while (count < numbers){
            if(isPrime(n)){
                System.out.println(n + " số nguyên tố");
                count++;
            }
            n++;
        }
    }

    public static boolean isPrime(int n) {
        boolean result = true;
        if (n > 2) {
            for (int i = 2; i < n - 1; i++) {
                if(n % i == 0){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}

