// https://codeforces.com/problemset/problem/271/A
import java.util.*;
public class BeautifulYear{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int ans=solve(year);
        System.out.println(ans);
        sc.close();
    }
    private static int solve(int year){
        year++;
        String s=Integer.toString(year);
        while(true){
            Set<Character> set=new HashSet<>();
            for(char c:s.toCharArray()) set.add(c);
            if(set.size()==4) break;
            year++;
            s=Integer.toString(year);
        }
        return year;

    }
}