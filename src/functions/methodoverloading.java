package functions;

public class methodoverloading {
    public static void main(String[] args) {
        next(29);
        next("mouni");
    }
    static void next(int a){
        System.out.println(a);

    }
    static void next(String name){
        System.out.println(name);
    }
}
