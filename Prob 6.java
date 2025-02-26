import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a input");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y;
        for(int i=1;i<=10;i++){
            y=x*i;
            System.out.println(y);
        }
    }
}
