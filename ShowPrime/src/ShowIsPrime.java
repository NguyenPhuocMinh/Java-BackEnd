import java.util.Scanner;

public class ShowIsPrime {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number to check is Prime: ");
        int number = input.nextInt();

        while(number < 100){
            if(isPrime(number)){
                System.out.println(number + " is Prime ");
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        boolean result = true;
        if(n > 2){
            for(int i = 2; i <= n - 1; i ++){
                if(n % i == 0){
                    result = false;
                }
            }
        }
        return result;
    }
}
