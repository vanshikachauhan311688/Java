import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x%4==0){
            System.out.println("the year is leap year ");
          }
        else{
            System.out.println("the year is not leap year");
        }
        sc.close();
    }
}
