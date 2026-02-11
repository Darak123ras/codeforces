// https://codeforces.com/problemset/problem/61/A
import java.util.*;

public class UltraFast{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s=solution(s1,s2);
        System.out.println(s);
        sc.close();
    }
    private static String solution(String s1,String s2){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                str.append("0");
            }else str.append("1");
        }
        return str.toString();
    }
}