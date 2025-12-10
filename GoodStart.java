import java.util.*;

public class GoodStart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int[] roof=new int[4];
            int[] bottom=new int[4];
            // [w,h,a,b]
            for(int i=0;i<4;i++) roof[i]=sc.nextInt();
            for(int i=0;i<4;i++) bottom[i]=sc.nextInt();
            
            
            String result=solution(roof,bottom);
            System.out.println(result);
        }

        sc.close();
    }
    private static String solution(int[] roof,int[] bottom){
        int w=roof[0];
        int h=roof[1];
        int a=roof[2];
        int b=roof[3];
        int x1=bottom[0];
        int y1=bottom[1];
        int x2=bottom[2];
        int y2=bottom[3];
        long roofArea = w * h;
        long sheetArea = a * b;
        long totalSheets = roofArea / sheetArea;
        if (roofArea % sheetArea != 0) {
            return "No";
        }
        
        if (totalSheets < 2) {
            return "No";
        }

        long sheet1Left = Math.max(x1, 0L);
        long sheet1Right = Math.min(x1 + a, w);
        long sheet1Bottom = Math.max(y1, 0L);
        long sheet1Top = Math.min(y1 + b, h);
        long sheet1Width = sheet1Right - sheet1Left;
        long sheet1Height = sheet1Top - sheet1Bottom;
        long sheet1Area = sheet1Width * sheet1Height;

        long sheet2Left = Math.max(x2, 0L);
        long sheet2Right = Math.min(x2 + a, w);
        long sheet2Bottom = Math.max(y2, 0L);
        long sheet2Top = Math.min(y2 + b, h);
        long sheet2Width = sheet2Right - sheet2Left;
        long sheet2Height = sheet2Top - sheet2Bottom;
        long sheet2Area = sheet2Width * sheet2Height;

        if (sheet1Area == 0 || sheet2Area == 0) {
            return "No";
        }

        long totalCoveredArea = sheet1Area + sheet2Area;
        if (totalCoveredArea > sheetArea * 2) {
            return "No";
        }

        long remainingArea = roofArea - totalCoveredArea;
        if (remainingArea < 0 || remainingArea % sheetArea != 0) {
            return "No";
        }
        long remainingSheets = remainingArea / sheetArea;
        if (remainingSheets != totalSheets - 2) {
            return "No";
        }
        
        return "Yes";

    }
}
