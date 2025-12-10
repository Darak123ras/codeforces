import java.util.Scanner;

public class AbovetheClouds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            
            boolean ans=solution(n,s);
            if(ans) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
    private static boolean solution(int n,String s){
        int[] f=new int[26];

        for(char c:s.toCharArray()) f[c-'a']++;
        
        for(int i=1;i<=n-2;i++){
            if(f[s.charAt(i)-'a']>=2) return true;
        }

        
        return false;

    }
}
