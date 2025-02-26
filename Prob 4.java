import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a Input");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch(a){
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 40:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
