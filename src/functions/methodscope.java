package functions;

public class methodscope {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        System.out.println(a);

        //we can access the variables in their particular funtion only,
        //it is called method scope or function scope.
    }
    static void next(){
        int num = 10;
        System.out.println(num);
    }

}
