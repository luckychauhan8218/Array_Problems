import java.util.HashSet;

public class AllMissingNumbersInRange {
    public static void main(String[] args) {

        int[] arr = {100, 101, 103, 110, 150, 199, 200};
        int start = 100;
        int end = 200;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (num >= start && num <= end) {
                set.add(num);
            }
        }

        for (int num = start; num <= end; num++) {
            if (!set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
