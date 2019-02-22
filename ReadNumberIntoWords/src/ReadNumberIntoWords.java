import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args) {
        System.out.print("Nhập số cần đọc : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String s;

        if (number < 10 && number >= 0) {
            switch (number) {
                case 1:
                    s = "one";
                    break;
                case 2:
                    s = "two";
                    break;
                case 3:
                    s = "three";
                    break;
                case 4:
                    s = "four";
                    break;
                case 5:
                    s = "five";
                    break;
                case 6:
                    s = "six";
                    break;
                case 7:
                    s = "seven";
                    break;
                case 8:
                    s = "eight";
                    break;
                case 9:
                    s = "nine";
                    break;
                default:
                    s = "Out of ability";
            }
            System.out.println(s);
        } else if (number > 10 && number < 20) {
            switch (number) {
                case 11:
                    s = "eleven";
                    break;
                case 12:
                    s = "twelve";
                    break;
                case 13:
                    s = "thirteen";
                    break;
                case 14:
                    s = "forteen";
                    break;
                case 15:
                    s = "fifeen";
                    break;
                case 16:
                    s = "sixteen";
                    break;
                case 17:
                    s = "seventeen";
                    break;
                case 18:
                    s = "eighteen";
                    break;
                case 19:
                    s = "nineteen";
                    break;
                default:
                    s = " Out of  ability";
            }
            System.out.println(s);
        } else if (number >= 20 && number < 100) {
            switch (number) {
                case 20:
                    s = "twenty";
                    break;
                case 21:
                    s = "twenty one";
                    break;
                case 22:
                    s = "twenty two";
                    break;
                case 23:
                    s = "twenty three";
                    break;
                case 24:
                    s = "twenty four";
                    break;
                case 25:
                    s = "twenty five";
                    break;
                case 26:
                    s = "twenty six";
                    break;
                case 27:
                    s = "twenty seven";
                    break;
                case 28:
                    s = "twenty eight";
                    break;
                case 29:
                    s = "twenty nine";
                    break;
                case 30:
                    s = "threety";
                    break;
                case 31:
                    s = "threety one";
                    break;
                case 32:
                    s = "threety two";
                    break;
                case 33:
                    s = "threety three";
                    break;
                case 34:
                    s = "threety four";
                    break;
                case 35:
                    s = "threety five";
                    break;
                case 36:
                    s = "threety six";
                    break;
                case 37:
                    s = "threety seven";
                    break;
                case 38:
                    s = "threety eight";
                    break;
                case 39:
                    s = "threety nine";
                    break;
                case 40:
                    s = "forty ";
                    break;
                case 41:
                    s = "forty one";
                    break;
                case 42:
                    s = "forty two";
                    break;
                case 43:
                    s = "forty three";
                    break;
                case 44:
                    s = "forty four";
                    break;
                case 45:
                    s = "forty five";
                    break;
                case 46:
                    s = "forty six";
                    break;
                case 47:
                    s = "forty seven";
                    break;
                case 48:
                    s = "forty eight";
                    break;
                case 49:
                    s = "forty nine";
                    break;
                case 50:
                    s = "fifty ";
                    break;
                case 51:
                    s = "fifty one";
                    break;
                case 52:
                    s = "fifty two";
                    break;
                case 53:
                    s = "fifty three";
                    break;
                case 54:
                    s = "fifty four";
                    break;
                case 55:
                    s = "fifty five";
                    break;
                case 56:
                    s = "fifty six";
                    break;
                case 57:
                    s = "fifty seven";
                    break;
                case 58:
                    s = "fifty eight";
                    break;
                case 59:
                    s = "fifty nine";
                    break;
                case 60:
                    s = "sixty";
                    break;
                case 61:
                    s = "sixty one";
                    break;
                case 62:
                    s = "sixty two";
                    break;
                case 63:
                    s = "sixty three";
                    break;
                case 64:
                    s = "sixty four";
                    break;
                case 65:
                    s = "sixty five";
                    break;
                case 66:
                    s = "sixty six";
                    break;
                case 67:
                    s = "sixty seven";
                    break;
                case 68:
                    s = "sixty eight";
                    break;
                case 69:
                    s = "sixty nine";
                    break;
                case 70:
                    s = "seventy ";
                    break;
                case 71:
                    s = "seventy one";
                    break;
                case 72:
                    s = "seventy two";
                    break;
                case 73:
                    s = "seventy three";
                    break;
                case 74:
                    s = "seventy four";
                    break;
                case 75:
                    s = "seventy five";
                    break;
                case 76:
                    s = "seventy six";
                    break;
                case 77:
                    s = "seventy seven";
                    break;
                case 78:
                    s = "seventy eight";
                    break;
                case 79:
                    s = "seventy nine";
                    break;
                case 80:
                    s = "eighty ";
                    break;
                case 81:
                    s = "eighty one";
                    break;
                case 82:
                    s = "eighty two";
                    break;
                case 83:
                    s = "eighty three";
                    break;
                case 84:
                    s = "eighty four";
                    break;
                case 85:
                    s = "eighty five";
                    break;
                case 86:
                    s = "eighty six";
                    break;
                case 87:
                    s = "eighty seven";
                    break;
                case 88:
                    s = "eighty eight";
                    break;
                case 89:
                    s = "eighty nine";
                    break;
                case 90:
                    s = "ninety ";
                    break;
                case 91:
                    s = "ninety one";
                    break;
                case 92:
                    s = "ninety two";
                    break;
                case 93:
                    s = "ninety three";
                    break;
                case 94:
                    s = "ninety four";
                    break;
                case 95:
                    s = "ninety five";
                    break;
                case 96:
                    s = "ninety six";
                    break;
                case 97:
                    s = "ninety seven";
                    break;
                case 98:
                    s = "ninety eight";
                    break;
                case 99:
                    s = "ninety nine";
                    break;
                default:
                    s = " Out of  ability";
            }
            System.out.println(s);
        }
    }
}
