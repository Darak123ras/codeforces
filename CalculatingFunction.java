// https://codeforces.com/problemset/problem/486/A
import java.util.*;

public class CalculatingFunction{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(solve(n));
        sc.close();
    }
    private static long solve(long n){
        long ans=0;
        for(long i=1;i<=n;i++){
            if(i%2==0) ans+=i;
            else ans-=i;
        }
        return ans;
    }
}