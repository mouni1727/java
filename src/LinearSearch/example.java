package LinearSearch;

public class example {
    public static void main(String[] args) {

        int[] example = {1 ,2 ,3 , 4 , 5,};
        int value = 2;
        int ans = linearSearch(example,value);

        System.out.println(ans);
    }
    static int linearSearch(int[] example,int value) {
        if (example.length == 0) {
            return -1 ;
        }
        for (int i = 0; i <= example.length; i++) {
            int elements = example[i];
            if (elements == value) {
                return 1;
            }
        }
        return -1;
    }

}

