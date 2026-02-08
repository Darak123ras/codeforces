//  https://codeforces.com/problemset/problem/467/A
import java.util.*;

public class George{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-->0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            count+=solve(p,q);
        }
        System.out.println(count);
        sc.close();
    }
    private static int solve(int p,int q){
        return (q-p)>=2?1:0;
    }
}