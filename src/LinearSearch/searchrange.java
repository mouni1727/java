package LinearSearch;

public class searchrange {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 2;
        System.out.println(linearsearch(arr, target, 1,4 ));
    }
    static int linearsearch(int[] arr, int target , int start, int end) {

        if(arr.length == 0) {
            return -1;
        }
        for(int index = start; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
