// https://codeforces.com/problemset/problem/200/B

import java.util.*;

public class Drinks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        double ans=solution(n,ar);
        System.out.println(ans);
        sc.close();
    }
    private static double solution(int n,int[] arr){
        double ans=0.0;
        for(int i:arr){
            ans+=((double)i/n);
        }
        return ans;
        // return Math.round(ans*1);
    }
}