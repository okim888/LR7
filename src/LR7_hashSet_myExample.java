import java.util.HashSet;
import java.util.Set;

public class LR7_hashSet_myExample {

    public static void main(String[] args) {

        Set<Integer> olHashSet = new HashSet<>();
        olHashSet.add(24);
        olHashSet.add(108);
        olHashSet.add(36);
        olHashSet.add(1166666);

        System.out.println(olHashSet);
        System.out.println(olHashSet.size());
        System.out.println(olHashSet.isEmpty());

    }
}
