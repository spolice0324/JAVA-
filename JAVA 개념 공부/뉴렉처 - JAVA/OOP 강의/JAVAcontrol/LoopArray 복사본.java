import java.sql.SQLOutput;

public class LoopArray {
    public static void main(String[] args) {

//        <li>egoing</li>
//        <li>yeokyoung</li>
//        <li>spolice</li>
//        html 태그를 달아주는 반복문을 작성

        String[] users = new String[3];
        users[0]="egoing";
        users[1]="yeokyoung";
        users[2]="spolice";

        for(int i = 0; i < users.length; i++)
        {
            System.out.println("<li>"+users[i]+"</li>");
        }

        for(int i = 0; i < users.length-1; i++)
        {
            System.out.println(users[i]+"님,");
        }
        System.out.println(users[users.length-1]+"님 환영합니다.");
    }
}
