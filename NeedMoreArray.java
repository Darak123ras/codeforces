import java.util.Scanner;

public class NeedMoreArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int result=needArray(a,n);
            System.out.println(result);
        }

        sc.close();
    }
    private static int needArray(int[] a,int n){
        int[] freq=new int[1000007];
        int maxFreq=0;
        for(int val:a){
            freq[val]++;
            if(freq[val]>maxFreq) maxFreq=freq[val];
            
        }
        return maxFreq;
    }
}
