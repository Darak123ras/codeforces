import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThoseWhoAreWithUs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] mat=new int[n][m];
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    mat[j][k]=sc.nextInt();
                }
            }
            
            int ans=solution(mat,n,m);
            System.out.println(ans);
        }
        sc.close();
    }
    private static int solution(int[][] a,int n,int m){
        int result = Integer.MAX_VALUE;
        int globalMax = Integer.MIN_VALUE;
        List<int[]> maxPositions = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(globalMax<a[i][j]){
                    globalMax=a[i][j];
                    maxPositions.clear();
                    maxPositions.add(new int[]{i,j});
                }else if(a[i][j]==globalMax){
                    maxPositions.add(new int[]{i,j});
                }
            }
        }
        for (int[] pos:maxPositions) {
            int currMax=Integer.MIN_VALUE;
            int r = pos[0];
            int c=pos[1];
            
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int val=a[i][j];
                    if(i==r || j==c) val=val-1;
                    currMax=Math.max(currMax,val);
                }
            }

            result=Math.min(result,currMax);
        }

        return result;

    }
}
