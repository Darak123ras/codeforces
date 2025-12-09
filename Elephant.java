//  https://codeforces.com/problemset/problem/617/A
import java.util.*;
public class Elephant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=solve(n);
        System.out.println(ans);
        sc.close();

    }
    private static int solve(int n){
        int count=0;
        while(n>0){
            if(n-5>=0){
                n-=5;
                count++;
            }else if(n-4>=0){
                n-=4;
                count++;
            }else if(n-3>=0){
                n-=3;
                count++;
            }else if(n-2>=0){
                n-=2;
                count++;
            }else if(n-1>=0){
                n--;
                count++;
            }
        }
        return count;
    }
}