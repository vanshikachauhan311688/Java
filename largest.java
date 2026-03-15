import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first  number ");
        int a  = sc.nextInt();
        System.out.println("enter sec number ");
        int b = sc.nextInt();
        System.out.println("enter 3rd number ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+"a is largest ");
        }
        else if(b>a && b>c){
            System.out.println(b+"b is largest ");
        }
    else {
       System.out.println( c+" c is largest");
    }
    sc.close();
    }
}
