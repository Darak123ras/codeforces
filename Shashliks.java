import java.util.*;

public class Shashliks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            
            long result=solution(k,x,y,a,b);
            System.out.println(result);
        }

        sc.close();
    }
    private static long solution(long k,long x,long y,long a,long b){
        long max=0;
        
        long max1=(k>=a)?(k-a)/x+1:0;
        for(long i = Math.max(0,max1-2);i<=max1;i++) {
            if (i < 0) continue;
            long tempAfterType1=k-i*x;
            long maxType2=(tempAfterType1>=b)?(tempAfterType1-b)/y+1:0;
            max=Math.max(max,i+maxType2);
        }
        
        long max2=(k>=b)?(k-b)/y+1:0;
        for(long i=Math.max(0,max2-2);i<=max2;i++){
            if(i<0) continue;
            long tempAfterType2=k-i*y;
            if(tempAfterType2>=a){
                max1=(tempAfterType2-a)/x +1;
            }else{
                max1=0;
            }
            max = Math.max(max, i + max1);
        }
        
        return max;
    }
}
