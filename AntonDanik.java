//  https://codeforces.com/problemset/problem/734/A
import java.util.*;
public class AntonDanik{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String ans=solve(n,s);
        System.out.println(ans);
        sc.close();
    }
    private static String solve(int n,String s){
        int a=0,d=0;
        for(char c:s.toCharArray()){
            if(c=='A') a++;
            else d++;
        }
        return a>d?"Anton":a<d?"Danik":"Friendship";
    }
}