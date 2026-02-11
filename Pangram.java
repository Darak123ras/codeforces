// https://codeforces.com/problemset/problem/520/A
import java.util.*;

public class Pangram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(solution(s,n)?"YES":"NO");
        sc.close();
    }
    private static boolean solution(String s,int n){
        Set<Character> set=new HashSet<>();
        s=s.toLowerCase();
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
        return set.size()==26?true:false;
    }
}