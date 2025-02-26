import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a input");
        Scanner scan = new Scanner(System.in);
        String firstname = scan.nextLine();
        String lastname = scan.nextLine();
        int n = scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++){
            System.out.println(firstname+lastname);
        }
    }
}
