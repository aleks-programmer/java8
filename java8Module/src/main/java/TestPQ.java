import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 */
public class TestPQ {
    public static void main(String[] args) {
        System.out.println("Start");
        long startTime = System.currentTimeMillis();
        Queue<Integer> ll = new ArrayDeque<>();
        for(int i = 0; i < 30000000; i++) {
            ll.add((int)Math.round(Math.random() * 30000000 + 1));
        }
        for(int i = 0; i < 30000000; i++) {
            ll.remove();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("End");
        System.out.println("Took: " + (endTime - startTime) / 1000 + " seconds");
    }
}
