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
        boolean serejaTurn = true;

        while (i <= j) {
            int chosen;

            if (ar[i] > ar[j]) {
                chosen = ar[i++];
            } else {
                chosen = ar[j--];
            }

            if (serejaTurn) {
                sereja += chosen;
            } else {
                dima += chosen;
            }

            serejaTurn = !serejaTurn; 
        }
        res[0]=sereja;
        res[1]=dima;
        return res;
    }
}