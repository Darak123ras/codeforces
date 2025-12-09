import java.util.Scanner;

public class PrefixMinandSuffixMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int l=0;l<n;l++) a[l]=sc.nextInt();
            
            String ans=solution(n,a);
            System.out.println(ans);
        }
        sc.close();
    }
    private static String solution(int n,int[] a){
        StringBuilder result=new StringBuilder();
        int[] prefix=new int[n];
        int[] suffix=new int[n];

        prefix[0]=a[0];
        suffix[n-1]=a[n-1];
        for(int i=1;i<n;i++) prefix[i]=Math.min(prefix[i-1],a[i]);
        for(int i=n-2;i>=0;i--) suffix[i]=Math.max(suffix[i+1],a[i]);
        
        for(int i=0;i<n;i++){
            if(a[i]==prefix[i] || a[i]==suffix[i]) result.append('1');
            else result.append('0');
        }
        
        return result.toString();
    }
}
