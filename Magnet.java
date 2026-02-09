// https://codeforces.com/problemset/problem/344/A
import java.util.*;

public class Magnet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s="";
        while(t-->0){
            s=sc.nextLine();
        }
        String str[]=s.split(" ");
        int i=0,n=str.length;
        StringBuilder res=new StringBuilder();
        while(i<n-1){
            boolean space=true;
            String s1=str[i];
            String s2=str[i+1];
            
            if(s1.charAt(s1.length()-1)!=s2.charAt(0)){
                space=false;
            }
            if(space){
                res.append(s1);
                res.append(" ");
            }else{
                res.append(s1);
            }
        }
        res.append(str[str.length-1]);
        String res1=res.toString();
        String []res2=res1.split(" ");
        System.out.println(res2.length);
        sc.close();
    }
}