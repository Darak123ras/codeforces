// https://codeforces.com/problemset/problem/381/A
import java.util.*;

public class SerejaAndDima{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[2];
        ans=solution(n,arr);
        for(int i:ans) System.out.print(i+" ");
        sc.close();
    }
    private static int[] solution(int n,int[] ar){
        int[] res=new int[2];
        int sereja=0;
        int dima=0;
        int i=0,j=n-1;
        while(i<j){
            while(ar[i]!=Integer.MIN_VALUE) i++;
            while(ar[j]!=Integer.MIN_VALUE) j--;
            if(i>=n) break;
            
            if(ar[i]>=ar[j]){
                sereja+=ar[i];
                ar[i]=Integer.MIN_VALUE;
                i++;
            }else{
                sereja+=ar[j];
                ar[j]=Integer.MIN_VALUE;
                j--;
            }
            
            if(ar[i]>=ar[j]){
                dima+=ar[i];
                ar[i]=Integer.MIN_VALUE;
                i++;
            }else{
                dima+=ar[j];
                ar[j]=Integer.MIN_VALUE;
                j--;
            }

        }
        res[0]=sereja;
        res[1]=dima;
        return res;
    }
}