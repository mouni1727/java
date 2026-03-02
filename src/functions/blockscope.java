package functions;

public class blockscope {
    public static void main(String[] args) {
        int a= 17;
        int b= 27;
        {
            a = 10;//a variable is initialized outside cannot,initialize again inside the block but it can be modified and used.
        // inside initialized variable cannot use outside,but initialize outside.
            b = 15;
            System.out.println(a);
        // the initialized variable in a block,will remain in same block.
        }
    }

}
