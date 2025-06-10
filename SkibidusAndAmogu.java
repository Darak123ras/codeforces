// https://codeforces.com/problemset/problem/2065/A

import java.util.*;

public class SkibidusAndAmogu {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0){
            String w=sc.next();
            
            String ans=helper(w);
            System.out.println(ans);
        }
        sc.close();

    }
    private static String helper(String s){
        int n=s.length();
        if(n<=2) return "i";
        
        return s.substring(0,n-2)+"i";
    }
}
