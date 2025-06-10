import java.util.*;

public class TrippiTroppi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String ans=helper(s);
            System.out.println(ans);
        }
        sc.close();

    }
    private static String helper(String s){
        String str[]=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(String ss:str){
            res.append(ss.substring(0,1));
        }
        return res.toString();
    }
}
