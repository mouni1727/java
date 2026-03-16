package arrays;

public class maximumvalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(maxRange(arr,1,3));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static int maxRange(int[] arr, int s, int m) {
        int maxRange = arr[s];
        for (int i = s; i <= m; i++) {
            if (arr[i] > maxRange) {
                maxRange = arr[i];
            }

        }
        return maxRange;
    }
}
