import java.util.*;
 class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a value of n:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int revN=0;
        while(n>0){
            int ld = n%10;
            revN = revN *10 + ld;
            n=n/10;
        }
        System.out.println(revN);
    }
}
