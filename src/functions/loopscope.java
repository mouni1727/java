package functions;

public class loopscope {
    public static void main(String[] args) {
        //scoping in for loops
        int a= 10;
        //whatever we initiaized in loop cannot initialize again.
        for(int i=0;i < 4;i++){
            System.out.println(i);
             a= 10;
        }
    }
}
