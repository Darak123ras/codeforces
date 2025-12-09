import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int j=sc.nextInt()-1;
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int l=0;l<n;l++) a[l]=sc.nextInt();
            
            String ans=solution(n,a,k,j);
            System.out.println(ans);
        }
        sc.close();
    }
    private static String solution(int n,int[] a,int k,int j){
        int target=a[j];
        int greater=0;
        int equal=0;
        
        for(int num:a){
            if(num>target){
                greater++;
            }else if(num == target){
                equal++;
            }
        }
        if(greater<k || (greater==k && equal>1)) return "YES";
        else return "NO";
        
    }
}
