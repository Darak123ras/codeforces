import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            boolean result=palindromeString(s,n,k);
            if(result) System.out.println("Yes");
            else System.out.println("No");
        }

        sc.close();
    }
    private static boolean palindromeString(String s,int n,int k){
        int count0 = 0, count1 = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') count0++;
            else count1++;
        }

        int maxPossibleGoodPairs = n / 2;
        if (k > maxPossibleGoodPairs) {
            return false;
        }

        if (k == maxPossibleGoodPairs) {
            if (count0 % 2 == 0 && count1 % 2 == 0) return true;
            else if (count0 == 0 || count1 == 0) return true;
            else return false;
        } else {
            int remainingPairs = maxPossibleGoodPairs - k;
            int needed0 = remainingPairs;
            int needed1 = remainingPairs;

            // Calculate lower and upper bounds for 0's to be placed
            int lowerBound = Math.max(0, 2 * k - count1);
            int upperBound = Math.min(2 * k, count0);

            int lowerBound2 = 2 * k - (count1 - needed1);
            int upperBound2 = count0 - needed0;

            int finalLower = Math.max(lowerBound, lowerBound2);
            int finalUpper = Math.min(upperBound, upperBound2);

            return finalLower <= finalUpper && finalUpper >= 0;
        }
    }
}
