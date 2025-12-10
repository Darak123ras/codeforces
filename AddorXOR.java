import java.util.*;

public class AddorXOR{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int ans=solution(a,b,x,y);
            System.out.println(ans);
        }
        sc.close();
    }
    private static int solution(int a,int b,int x,int y){
        if (a == b) {
            return 0;
        }
        Set<Integer> visit= new HashSet<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(arr -> arr[1]));
        
        queue.add(new int[]{a, 0});
        visit.add(a);

        while (!queue.isEmpty()) {
            int[] current=queue.poll();
            int val=current[0];
            int cost=current[1];

            if(val==b) return cost;

            int nextVal = val + 1;
            if (nextVal <= 1000 && !visit.contains(nextVal)) {
                visit.add(nextVal);
                queue.add(new int[]{nextVal, cost + x});
            }

            nextVal = val ^ 1;
            if (nextVal <= 1000 && !visit.contains(nextVal)) {
                visit.add(nextVal);
                queue.add(new int[]{nextVal, cost + y});
            }
        }
        return -1;
    }
}
