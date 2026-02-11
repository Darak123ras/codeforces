// https://codeforces.com/problemset/problem/228/A
import java.util.*;

public class Horseshoe{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int ans=solution(s1,s2,s3,s4);
        System.out.println(ans);
        sc.close();
    }
    private static int solution(int s1,int s2,int s3,int s4){
        Set<Integer> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        return 4-set.size();
    }
}