import java.util.Scanner;

public class SmiloandMinecraft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
            }
            
            int result=solution(grid,n,m,k);
            System.out.println(result);
        }

        sc.close();
    }
    private static int solution(char[][] grid ,int n,int m,int k){
        int maxGold = 0;
        for (int i = 0; i < n; i++) {
            for (int jj = 0; jj < m; jj++) {
                if (grid[i][jj] == '.') {
                    int gold = calculateGold(grid, n, m, k, i, jj);
                    if (gold > maxGold) {
                        maxGold = gold;
                    }
                }
            }
        }
        
        
        return maxGold;

    }
    private static int calculateGold(char[][] grid, int n, int m, int k, int x, int y) {
        int goldCount = 0;
        int startX = x - k;
        int startY = y - k;
        int endX = x + k;
        int endY = y + k;
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if (i < 0 || i >= n || j < 0 || j >= m) {
                    continue;
                }
                if (grid[i][j] == 'g') {
                    if (i == startX || i == endX || j == startY || j == endY) {
                        goldCount++;
                    }
                }
            }
        }
        return goldCount;
    }
}
