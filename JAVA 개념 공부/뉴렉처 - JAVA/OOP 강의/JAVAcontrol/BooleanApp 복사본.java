public class BooleanApp {
    public static void main(String[] args) {

        System.out.println("one");
        System.out.println(1);
        //boolean
        System.out.println(true);
        System.out.println(false);
        //true와 false가 존재, 변수의 이름으로 사용할 수 없다. = reserved word

        String foo = ("Hello World");
        System.out.println(foo.contains("World")); //foo 라는 문자열은 World를 포함하고 있으므로 결과값 true
        System.out.println(foo.contains("yeokoung")); //yeokyoung 이라는 문자열은 포함하고 있지않으므로 결과값 false

    }
}
