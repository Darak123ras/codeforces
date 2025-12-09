// https://codeforces.com/problemset/problem/977/A
import java.util.*;
public class WrongSubstraction{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt();
        long ans=solve(n,k);
        System.out.println(ans);
        sc.close();
    }
    private static long solve(long n,int k){
        while(k>0){
            if(k==0) break;
            if(n%10==0){
                n/=10;
            }else{
                n--;
            }
            k--;
        }
        return n;
    }
}