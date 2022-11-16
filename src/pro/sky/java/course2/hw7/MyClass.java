package pro.sky.java.course2.hw7;

public class MyClass {
    public static void main(String[] args) {
        
//        Square x = new Square();
//        int a = 1;
//        double b = 2;
//        System.out.print(x.s(a, b + a));
//        System.out.print(x.s(a++, a));
        
        Square x = new Square();
        Square y = new Square();
        int q;
        for (int i = 0; i < 5; i++) {
            q = (i > 2) ? ++x.a : y.a++;
            System.out.print(q);
        }
    }
}
