public class ArrayApp {
    public static void main(String[] args) {

        //egoing, yeokyoung, spolice
        //String users = "egoing, yeokyoung, spolice";
        String[] users = new String[3];
        users[0]="egoing";
        users[1]="yeokyoung";
        users[2]="spolice";

        System.out.println(users[0]);
        System.out.println(users.length);

        int[] scores = {10, 100, 1000};
        System.out.println(scores[1]);
        System.out.println(scores.length);

    }
}
