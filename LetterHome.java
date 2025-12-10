import java.util.*;

public class LetterHome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int[] x=new int[n];
            for(int j=0;j<n;j++) x[j]=sc.nextInt();
            int ans=solution(x,n,s);
            System.out.println(ans);
        }
        sc.close();
    }
    private static int solution(int[] ar,int n,int s){
        if(n==1) return Math.abs(ar[0]-s);
        int res=0;
        
        int x=ar[0];
        int y=ar[n - 1];
        if(s<=x) res=y-s;
        else if(s>=y) res=s-x;
        else{
            int option1=2*(y-s)+(s-x);
            int option2=(s-x)*2+(y-s);
            res=Math.min(option1,option2);
        }
        return res;

    }
}
