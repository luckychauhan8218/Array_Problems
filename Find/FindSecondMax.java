public class FindSecondMax {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 7, 20, 20};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if(secondMax==Integer.MIN_VALUE){
            System.out.println("No Second maximum element");
        }else{
            System.out.println("Second maximum element: " + secondMax);
        }
    }
}
