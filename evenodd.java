import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // sc.close();
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x%2==0){
         System.out.println("even");
        }
   /*if(x%2!=0) */     else{
            System.out.println("odd");
        }
            sc.close();
        }
}

