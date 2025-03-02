import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a value of n:");
       int n = scan.nextInt();
        for(int i=n; i>=1; i--) {
           for(int j=i; j>=1; j--){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
