import java.util.*;
public class NextRound{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt()-1;
        int[] ar=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int pass=ar[k];
        for(int i=0;i<n;i++){
            if(ar[i]!=0 && ar[i]>=pass) count++;
        }
        System.out.println(count);
        sc.close();
    }
}