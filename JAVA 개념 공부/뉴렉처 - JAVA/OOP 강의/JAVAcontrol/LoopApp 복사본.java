public class LoopApp {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println("=====while문=====");
        int i = 0;
        while(i <3) {
            System.out.println(2);
            System.out.println(3);
            i++;
        }
        System.out.println("=====for문=====");
        for(int j = 0; j < 3; j++)
        {
            System.out.println(5);
            System.out.println(6);
        }
        System.out.println(4);
    }
}
