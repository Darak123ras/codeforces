// https://codeforces.com/problemset/problem/116/A
import java.util.*;
public class Tram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int curr=0;
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            curr=curr+b-a;
            max=Math.max(max,curr);
        }
        System.out.println(max);
        sc.close();
    }
}