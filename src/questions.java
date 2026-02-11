import java.util.Scanner;

public class questions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // find the largest numbers among 3

        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        System.out.println(max);
    }

//    int max = math.max(c, math.max(a, b));
//    System.out.println(math.max(34, 57));


}
