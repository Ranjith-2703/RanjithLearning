import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      int num3 = scan.nextInt();
      if(num1+num2+num3 == 180) {
          System.out.println("Triangle can be formed");
      } else {
          System.out.println("Triangle cannot be formed");
      }
    scan.close();
    }
}
