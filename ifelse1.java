import java.util.Scanner; // even or odd
public class ifelse1 {
    

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Not Even");
            sc.close();
        }
}
}

