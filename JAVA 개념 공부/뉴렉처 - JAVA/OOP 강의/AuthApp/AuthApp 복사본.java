public class AuthApp {
    public static void main(String[] args) {
        System.out.println(args[0]);

        String id = "spolice";
        String inputID = args[0];

        String password = "1111";
        String inputPassword = args[1];
        System.out.println("Hi~ H ~ I");

        //if(id == inputID)시, who are you가 출력됨 -> 이유?
//        if(inputID.equals(id))
//        {
//            if(inputPassword.equals((password))) {
//                System.out.println("Welcome Master, spolice!");
//            }
//            else
//                System.out.println("Wrong Password");
//        }
//        else
//            System.out.println("Who are you?");
          if(inputID.equals(id) && inputPassword.equals((password)))
            System.out.println("Welcome Master, spolice!");
        else
                System.out.println("Who are you?");
    }
}

