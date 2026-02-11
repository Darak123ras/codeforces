// https://codeforces.com/problemset/problem/705/A
import java.util.*;

public class Hulk{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=solution(n);
        System.out.println(s);
        sc.close();
    }
    private static String solution(int n){
        StringBuilder str=new StringBuilder();
        int i=1;
        while(i<=n){
            if(i%2==0){
                str.append("I love ");
            }else{
                str.append("I hate ");
            }
            i++;
            if(i>n){
                str.append("it ");
            }else{
                str.append("that ");
            }
        }
        return str.toString();
    }
}