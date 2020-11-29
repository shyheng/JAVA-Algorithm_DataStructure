import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedTest {
    public static void main(String[] args) {
        //数组实现
        List<String> array = new ArrayList<>();
        //链表实现
        List<String> linked = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            array.add("shy");
        }
        long end = System.nanoTime();
        System.out.println("array:"+(end-start));

        long start1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linked.add("shy");
        }
        long end1 = System.nanoTime();
        System.out.println("linked:"+(end1-start1));
    }
}
