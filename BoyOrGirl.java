// https://codeforces.com/problemset/problem/236/A

import java.util.*;
public class BoyOrGirl{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean ans=solve(s);
        System.out.println(ans?"CHAT WITH HER!":"IGNORE HIM!");
        sc.close();
    }
    private static boolean solve(String s){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size()%2!=0?false:true;
    }
}