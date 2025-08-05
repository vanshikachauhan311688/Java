public class pattern3 {

    static void pattern4(){
    
        int n =5;
        for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
                if(row == 1 || col == 1 || col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        pattern4();
    }
}


    

    

