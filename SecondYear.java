import java.util.*;

public class SecondYear{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            secondYear(s);

        }
        sc.close();
    }
    private static void secondYear(String s){
        int year = Integer.parseInt(s);
        boolean found = false;

        for (int sum = 0; sum <= 200; sum++) {
            if (sum * sum == year) {
                System.out.println("0 " + sum); 
                found = true;
                break;
            }
        }

        if (!found)System.out.println(-1);
        
        
        
    }
}