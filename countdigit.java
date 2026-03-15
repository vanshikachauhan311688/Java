import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int count =0;
       if(n==0) count++;
     while(n!=0){ //n>0
            n/=10; // n=n/10
            count++;
        }
        System.out.println("the count of the number is : " + count);
         sc.close();
    }
}
