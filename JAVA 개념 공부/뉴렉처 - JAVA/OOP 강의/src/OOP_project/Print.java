
class Print {
    public String delimiter = ""; //전역변수 선언

    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
}