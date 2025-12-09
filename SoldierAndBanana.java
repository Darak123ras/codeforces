// https://codeforces.com/problemset/problem/546/A
import java.util.*;
public class SoldierAndBanana{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(); // cost of banana 1*k,2*k,3*k,...
        int n=sc.nextInt(); // money soldier has
        int w=sc.nextInt(); // Bananas to buy
        int ans=solve(k,n,w);
        System.out.println(ans);
        sc.close();

    }
    private static int solve(int k,int n,int w){
        int money=0;
        for(int i=1;i<=w;i++){
            money+=i*k;
        }

        
        return money-n>0?money-n:0;
    }
}