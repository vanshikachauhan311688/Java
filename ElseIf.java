import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your percentage");
        int n  = sc.nextInt();
        if(n>90){
            System.out.println("excellent");
        }
        else if (n>80){
            System.out.println("very good ");
        }
        else{
            System.out.println("can do better ");
        }
    sc.close();
    }
    
}
