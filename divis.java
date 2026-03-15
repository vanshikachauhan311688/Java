import java.util.Scanner;
public class divis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num ");
        int x =  sc.nextInt();
    if(x%5==0){
        System.out.println("the number is divisible by five ");
    }
    else if (x%3==0){
        System.out.println("the number is divisible by three");
    }
   else {
    System.out.println("not divisible by five and three ");
   }
   sc.close();

   // if (x%5==0 && x%3==0 ) //if(x%15==0) if (x%5==0 || x%3==0 )
    }
}
