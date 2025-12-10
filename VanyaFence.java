// https://codeforces.com/problemset/problem/677/A
import java.util.*;
public class VanyaFence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int ans=solve(n,a,h);
        System.out.println(ans);
        sc.close();
    }
    private static int solve(int n,int[] a,int h){
        int count=n;
        for(int i:a){
            if(i>h) count++;
        }
        return count;
    }
}