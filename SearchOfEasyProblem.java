// https://codeforces.com/problemset/problem/1030/A
import java.util.*;
public class SearchOfEasyProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean hard=false;
        for(int i:a){
            if(i==1){
                hard=true;
                break;
            }
        }
        System.out.println(hard?"Hard":"Easy");
        sc.close();
    }
}