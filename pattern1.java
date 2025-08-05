public class pattern1 {

    static void pattern2(){
    
        int n =5;
        for(int row=1; row<=n; row++){
            for(int space=1; space<=n-row;space++){
                System.out.print("  "); // Print spaces for right alignment
            }
            for(int col=1; col<=row; col++){
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        pattern2();
    }
}


    

