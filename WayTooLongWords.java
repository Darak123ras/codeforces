import java.util.*;
public class WayTooLongWords{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String ans=solve(s);
            System.out.println(ans);
        }
        sc.close();
    }
    private static String solve(String s){
        int n=s.length();
        if(n<=10) return s;
        return s.substring(0,1)+Integer.toString(n-2)+s.substring(n-1);
    }
}