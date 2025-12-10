import java.util.Scanner;

public class BlackboardGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            
            String ans=solution(n);
            System.out.println(ans);
        }
        sc.close();
    }
    private static String solution(int n){
        return (n%4==0)?"Bob":"Alice";
    }
}
