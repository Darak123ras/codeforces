// https://codeforces.com/problemset/problem/2091/A

import java.util.*;

public class OlympiadDate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            
            int ans=helper(n,a);
            System.out.println(ans);
        }
        sc.close();

    }
    private static int helper(int n,int[] arr){
        int ans=0;
        int[] a={0,1,0,3,2,0,2,5};
        
        for(int i=0;i<a.length;i++){
            int j=0;
            while(j<n){
                if(arr[j]==a[i]){
                    arr[j]=Integer.MIN_VALUE;
                    a[i]=Integer.MIN_VALUE;
                    break;
                }
                j++;
                
            }
            if(a[i]!=Integer.MIN_VALUE) return 0;

        }
        for(int i=n-1;i<n;i--){
            if(arr[i]==Integer.MIN_VALUE) {
                ans=i+1;
                break;
            }
        }
        return ans;
    }
}
