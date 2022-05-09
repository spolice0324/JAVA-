import javax.swing.*;

public class AuthApp3 {
    public static void main(String[] args) {

       // String[] users = {"yesong", "yeokyoung", "spolice"};
        String[][] users = {
                {"yesong", "1111"},
                {"yeokyoung","2222"},
                {"spolice", "3333"}
        };

        String inputID = args[0];
        String inputPassWord = args[1];
        boolean isLogined = false;
        for(int i = 0; i < users.length ; i++) {
            String[] current = users[i];
            if(current[0].equals(inputID)) {
              if ((current[1]).equals(inputPassWord)) {
                    isLogined = true;
                    break;
                }
              else
                  System.out.println("You've got Wrong Password");
            }
            else
                System.out.println("NO data");
        }
        if(isLogined)
            System.out.println("Welcome Master!");
        else
            System.out.println("You are not a User or You've got Wrong Password");
    }
}
