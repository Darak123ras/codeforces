// https://codeforces.com/problemset/problem/344/A
import java.util.*;

public class Magnet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder s=new StringBuilder();
        while(t>=0){
            String st=sc.nextLine();
            s.append(st).append(" ");
            t--;
        }
        int ans=solve(s.toString());
        System.out.println(ans);
        sc.close();
    }
    private static int solve(String s){
        
        int n=s.length();
        String[] str=s.trim().split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=1;i<str.length;i++){
            
            String s1=str[i-1];
            String s2=str[i];
            if(s1.charAt(s1.length()-1)!=s2.charAt(0)){
                res.append(s1);
            }else{
                res.append(s1);
                res.append(" ");
            }
        }
        res.append(str[str.length-1]);
        s=res.toString();
        String[] s2=s.split(" ");

        return s2.length;
    }
}