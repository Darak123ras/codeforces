import java.util.*;

public class MinimizeFixedPoints {
    static final int N = 100_005;
    static int[] spf = new int[N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            
            solution(n);
        }
        sc.close();
    }
    private static void solution(int n){
        int[] p = new int[n + 1];
        boolean[] used = new boolean[n + 1];

        Map<Integer, List<Integer>> primeGroups = new HashMap<>();

        for (int i = 2; i <= n; i++) {
            int prime = spf[i];
            primeGroups.computeIfAbsent(prime, x -> new ArrayList<>()).add(i);
        }

        for (List<Integer> group : primeGroups.values()) {
            int sz = group.size();
            for (int i = 0; i < sz; i++) {
                int from = group.get(i);
                int to = group.get((i + 1) % sz);
                p[from] = to;
                used[to] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (p[i] == 0) p[i] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(p[i] + (i == n ? "\n" : " "));
        }
        
    }
    static void sieve() {
        for (int i = 2; i < N; i++) spf[i] = i;
        for (int i = 2; i * i < N; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < N; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }
}
