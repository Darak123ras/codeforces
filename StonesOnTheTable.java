// https://codeforces.com/problemset/problem/266/A

import java.util.*;
public class StonesOnTheTable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int ans=solve(n,s);
        System.out.println(ans);
        sc.close();
    }
    private static int solve(int n,String s){
        int count=0;
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            if(i+1<n){
                char b=s.charAt(i+1);
                if(a==b) count++;
            }
        }
        return count;
    }
}