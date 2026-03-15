import java.util.Scanner;  // if  we press button 1  then print  hello....
public class ifelse4 { 
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("hello");
        }else if (n==2){
            System.out.println("Namaste");
            }else if (n==3){
                System.out.println("Bonjour");
            }else{
                System.out.println("Invalid Button");
            }
            sc.close();
}
}  

