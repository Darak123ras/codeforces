// https://codeforces.com/problemset/problem/2065/B

import java.util.*;

public class SkibidusAndOhio {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0){
            String s=sc.next();
            
            int ans=helper(s);
            System.out.println(ans);
        }
        sc.close();

    }
    private static int helper(String s){
        int n=s.length();
        if(n==1) return 1;
        List<Character> list=new ArrayList<>();
        for(char c:s.toCharArray()) list.add(c);
        int i=0;
        while(i<n-1){
            // if(i==n)
            char c1=list.get(i);
            char c2=list.get(i+1);
            boolean performed=false;
            if(c1==c2){
                list.remove(i+1);
                performed=true;
            }
            n=list.size();
            if(performed){
                return 1;
            }
            i++;
        }
        return s.length();
    }
}
