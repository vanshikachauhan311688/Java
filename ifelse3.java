import java.util.Scanner; //divisibles
public class ifelse3 {
     public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("divisible by five");
        }else{
            System.out.println("Not divisible by five");
            sc.close();
        }
}
}