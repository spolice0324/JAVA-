public class MyOOP {
    public static String delimiter = ""; //전역변수 선언
    public static void main(String[] args) {
        delimiter = "----"; //전역변수 호출
        printA();
        printA();
        printB();
        printB();

        delimiter = "****";
        printA();
        printA();
        printB();
        printB();

    }

    public static void printB() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

    public static void printA() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    }




