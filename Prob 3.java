import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a Grade");
        Scanner scan = new Scanner(System.in);
        int Grade = scan.nextInt();
        if(Grade>=90){
            System.out.println("Grade A");
        }
        else if(Grade>=80){
            System.out.println("Grade B");
        }
        else if(Grade>=60){
            System.out.println("Grade C");
        }
        else if(Grade>=35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        scan.close();
    }
}
