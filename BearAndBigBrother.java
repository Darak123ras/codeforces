//  https://codeforces.com/problemset/problem/791/A
import java.util.*;
public class BearAndBigBrother{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=solve(a,b);
        System.out.println(ans);
        sc.close();
    }
    private static int solve(int a,int b){
        int count=0;
        while(a<=b){
            a*=3;
            b*=2;
            count++;
        }
        return count;
    }
}