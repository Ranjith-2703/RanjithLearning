import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a input");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        for(int i=1;i<=y;i++){
            System.out.println(x);
        }
    }
}
