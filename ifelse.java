import java.util.Scanner; // age vala 
public class ifelse {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        if(n>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
            sc.close();
        }
}
}
