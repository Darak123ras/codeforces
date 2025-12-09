import java.util.*;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            int x = sc.nextInt();
            solution(x);
        }
        sc.close();
    }
    private static void solution(int x){
        Set<Character> set= new HashSet<>();
        for (char c:String.valueOf(x).toCharArray()) {
            set.add(c);
        }
        for (int y = 0; y <= 9; y++) {
            if (set.contains((char) (y + '0'))) {
                System.out.println(y);
                break;
            }
        }
    }
}
