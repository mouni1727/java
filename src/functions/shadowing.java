package functions;

public class shadowing {
    static int x = 10;//this will be shadowed
    public static void main(String[] args) {
        System.out.println(x);
        int x = 27;//the class variable at line 4 is shadowed by this.

        //scope will begin when the value is initialized.

        System.out.println(x);
        next();
    }
    static void next(){
        System.out.println(x);
    }
}
