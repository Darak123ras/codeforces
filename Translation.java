//  https://codeforces.com/problemset/problem/41/A
import java.util.*;
public class Translation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean ans=solve(s1,s2);
        System.out.println(ans?"YES":"NO");
        sc.close();
    }
    private static boolean solve(String s1,String s2){
        int n=s1.length();
        StringBuilder s=new StringBuilder(s1);
        s.reverse();
        if(!s.toString().equals(s2)) return false;
        return true;
    }
}