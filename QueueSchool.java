// https://codeforces.com/problemset/problem/266/B
import java.util.*;
public class QueueSchool{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        String ans=solve(n,s,t);
        System.out.println(ans);
        sc.close();
    }
    private static String solve(int n,String s,int k){
        char[] ch=s.toCharArray();
        while(k>0){
            for(int i=0;i<n;i++){
                if(i!=n-1 && (ch[i]=='B' && ch[i+1]=='G')){
                    char temp=ch[i];
                    ch[i]=ch[i+1];
                    ch[i+1]=temp;
                    i++;
                }
            }
            k--;
        }
        StringBuilder str=new StringBuilder();
        for(char c:ch) str.append(c);
        return str.toString();
    }
}