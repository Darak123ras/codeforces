// https://codeforces.com/problemset/problem/136/A
import java.util.*;

public class Present{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        solve(n,ar);
        sc.close();
    }
    private static void solve(int n,int[] a){
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int j=a[i]-1;
            ans[j]=i+1;
        }
        for(int i:ans) System.out.print(i+" ");
    }
}