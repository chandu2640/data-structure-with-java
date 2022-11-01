package recursion;

public class Trial {
    public static void main(String[] args) {
        fun();
    }

    private static void fun() {
        System.out.println("Hello");
        fun1();
        System.out.println("fun Done");
    }

    private static void fun1() {
        System.out.println("Hello1");
        fun2();
        System.out.println("fun1 done");
    }
    private static void fun2() {
        System.out.println("Hello2");
        fun3();
        System.out.println("fun2 done");
    }
    private static void fun3() {
        System.out.println("Hello3");
        fun4();
        System.out.println("fun3 done");
    }
    private static void fun4() {
        System.out.println("Hello4");
        System.out.println("fun4 done");
    }
}
