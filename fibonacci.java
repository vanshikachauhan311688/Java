public class fibonacci {
    public static void main(String[] args){
        int f=0;
        int s=1;
        int n=10;
        for(int i=1; i<=n;i++){
            System.out.println(f);

        
        int next=f+s;
        f=s;
        s=next;
    }
    }
}

