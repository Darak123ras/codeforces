// https://codeforces.com/problemset/problem/59/A
import java.util.*;
public class Word{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=solve(s);
        System.out.println(ans);
        sc.close();
    }
    private static String solve(String s){
        int n=s.length();
        int lower=0,upper=0;
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)) lower++;
            else upper++;
        }
        return lower>=upper?s.toLowerCase():s.toUpperCase();
    }
}