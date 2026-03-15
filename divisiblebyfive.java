import java.util.Scanner;
public class divisiblebyfive {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x%5==0){
            System.out.println("number is divisible by five ");
        }
        else{
            System.out.println(" the num not divisible by panch ");
        }
        sc.close();
    }
}
