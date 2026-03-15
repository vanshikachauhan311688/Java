import java.util.Scanner;
public class div {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x%5==0){
            if(x%3==0){
           System.out.println("number is divisible by five and three ");
            }
            else {
                System.out.println("not divisble  ");
            }
            }
         
        else{
            System.out.println("not divisible by five and three  ");
        }
        sc.close();
    }
}
