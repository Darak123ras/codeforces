import java.util.*;
public class BeautifulMatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] ar=new int[5][5];
        int row=0,col=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                ar[i][j]=sc.nextInt();
                if(ar[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        }
        int min=Math.abs(2-row)+Math.abs(2-col);
        System.out.println(min);
        sc.close();
    }
}