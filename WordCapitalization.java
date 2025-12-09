//  https://codeforces.com/problemset/problem/281/A
import java.util.*;
public class WordCapitalization{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=solve(s);
        System.out.println(ans);
        sc.close();
    }
    private static String solve(String s){
        return s.substring(0,1).toUpperCase()+s.substring(1);
    }
}