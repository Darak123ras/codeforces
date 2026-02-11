// https://codeforces.com/problemset/problem/1328/A
import java.util.*;

public class Divisibility{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Integer> ans=new ArrayList<>();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            ans.add(solution(a,b));
        }
        for(int i:ans) System.out.println(i);
        sc.close();
    }
    private static int solution(int a,int b){
        return a%b==0?0:b-(a%b);
    }
}