// https://codeforces.com/problemset/problem/339/A
import java.util.*;
public class HelpfullMaths{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=solve(s);
        System.out.println(ans);
        sc.close();
    }
    private static String solve(String s){
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        List<String> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==n-1){
                li.add(s.substring(i));
                break;
            }else if(s.charAt(i)=='+') continue;
            li.add(s.substring(i,i+1));
        }
        Collections.sort(li);
        for(int i=0;i<li.size();i++){
            String str=li.get(i);
            sb.append(str);
            if(i==li.size()-1) break;
            sb.append("+");
        }
        return sb.toString();

    }
}