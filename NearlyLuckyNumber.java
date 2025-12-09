// https://codeforces.com/problemset/problem/110/A

import java.util.*;
public class NearlyLuckyNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean isLucky=solve(s);
        System.out.println(isLucky?"YES":"NO");
        sc.close();
    }
    private static boolean solve(String s){
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='4' || s.charAt(i)=='7') count++;
        }
        return count==4 || count==7;
    }
}