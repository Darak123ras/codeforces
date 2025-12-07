// https://codeforces.com/problemset/problem/112/A

import java.util.*;
public class PetyaNStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int ans=solve(s1,s2);
        System.out.println(ans);
        sc.close();
    }
    private static int solve(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)<s2.charAt(i)) return -1;
            else if(s1.charAt(i)>s2.charAt(i)) return 1;
        }
        return 0;
    }
}