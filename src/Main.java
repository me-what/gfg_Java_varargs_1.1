public class Main {
    public static void main(String[] args) {
        fun(100);
        fun(1, 2, 3, 4);
        fun();

        // 2
        fun2("GeeksforGeeks", 100, 200);
        System.out.println();
        fun2("CSPortal", 1, 2, 3, 4, 5);
        System.out.println();
        fun2("forGeeks");
    }

    static void fun(int... a)
    {
        System.out.println("Number of arguments: "
                + a.length);
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    static void fun2(String str, int... a)
    {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: "
                + a.length);
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}